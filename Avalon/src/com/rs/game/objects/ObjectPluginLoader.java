package com.rs.game.objects;

import com.rs.game.WorldObject;
import com.rs.utils.Logger;
import com.rs.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ObjectPluginLoader {

	public static final HashMap<Object, ObjectPlugin> cachedObjectPlugins = new HashMap<Object, ObjectPlugin>();
	public static ObjectPlugin getPlugin(WorldObject object) {
		int x = object.getX();
		int y = object.getY();
		int plane = object.getPlane();

		ObjectPlugin plugin = cachedObjectPlugins.getOrDefault(object.getId(), cachedObjectPlugins.get(object.getName()));

		if (plugin != null) {
			System.out.println("[ObjectPluginLoader] " + object.getName() + "(" + object.getId() + "): plugin was found by Id. Plugin: " + plugin.getClass());
			return plugin;
		}

        ObjectPlugin fallback = null;
        for (Map.Entry<Object, ObjectPlugin> entry : cachedObjectPlugins.entrySet()) {
            Object[] keys = entry.getValue().getKeys();
            for (Object key : keys) {
                if (key instanceof ObjectKey) {
                    ObjectKey objectKey = (ObjectKey) key;
                    if (objectKey.matches(object.getId(), x, y, plane)) {
                        plugin = entry.getValue();
                        System.out.println("[ObjectPluginLoader] " + object.getName() + "(" + object.getId() + "): Found plugin by key. Plugin: " + plugin.getClass());
                        return plugin;
                    } else if (objectKey.matches(object.getId())) {
                        fallback = entry.getValue();
                    } else if (objectKey.matches(object.getName())) {
                        fallback = entry.getValue();
                    }
                }
            }
        }
        if (fallback != null) {
            return fallback;
        }

        System.out.println("[ObjectPluginLoader] " + object.getName() + "(" + object.getId() + "): Found no plugin for this object.");
		return null;
	}

	@SuppressWarnings("rawtypes")
	public static final void init() {
		try {
			String[] pluginFolders = {"com.rs.game.objects.plugins"};
			Set<Class> processedClasses = new HashSet<>();
			for (String pluginFolder : pluginFolders) {
				Class[] classes = Utils.getClasses(pluginFolder);
				for (Class c : classes) {
					if (c.isAnonymousClass() || processedClasses.contains(c))
						continue;
					Object o = c.newInstance();
					if (!(o instanceof ObjectPlugin))
						continue;
					ObjectPlugin plugin = (ObjectPlugin) o;
					for (Object key : plugin.getKeys())
						cachedObjectPlugins.put(key, plugin);
					processedClasses.add(c);
				}
			}
			System.out.println("[ObjectPluginLoader]: " + processedClasses.size() + " plugins were loaded.");
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}
}
