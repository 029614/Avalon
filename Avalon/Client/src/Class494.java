/* Class494 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class494 {
    Class348 aClass348_6089 = new Class348(64);
    public int anInt6090;
    Class243 aClass243_6091;
    static int anInt6092;

    public Class494(Class411 class411, Class429 class429, Class243 class243) {
	this.aClass243_6091 = class243;
	anInt6090 = (this.aClass243_6091.method2316((-1006924897 * (Class120.aClass120_1424.anInt1460)), -1214131434) * 1832969825);
    }

    public Class473 method6191(int i, byte i_0_) {
	try {
	    Class473 class473;
	    synchronized (this.aClass348_6089) {
		class473 = (Class473) this.aClass348_6089.method4184(i);
	    }
	    if (class473 != null)
		return class473;
	    byte[] is;
	    synchronized (this.aClass243_6091) {
		is = (this.aClass243_6091.getFile(Class120.aClass120_1424.anInt1460 * -1006924897, i));
	    }
	    class473 = new Class473();
	    if (is != null)
		class473.method6067(new RsByteBuffer(is), 1327711716);
	    synchronized (this.aClass348_6089) {
		this.aClass348_6089.method4194(class473, i);
	    }
	    return class473;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("uj.a(").append(')').toString());
	}
    }

    public static boolean method6192(String string, int i) {
	try {
	    if (string == null)
		return false;
	    for (int i_1_ = 0; i_1_ < client.anInt8941 * -1054937867; i_1_++) {
		if (string.equalsIgnoreCase(client.aStringArray8704[i_1_]))
		    return true;
	    }
	    if (string.equalsIgnoreCase(Class287.myPlayer.aString10195))
		return true;
	    return false;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("uj.md(").append(')').toString());
	}
    }

    static void method6193(int i, int i_2_, int i_3_) {
	try {
	    Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(16, i);
	    class298_sub37_sub12.method3449((byte) 109);
	    class298_sub37_sub12.type = 1274450087 * i_2_;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("uj.an(").append(')').toString());
	}
    }
}
