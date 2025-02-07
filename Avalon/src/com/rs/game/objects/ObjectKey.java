package com.rs.game.objects;

public class ObjectKey {
    private int objectId;
    private String objectName;
    private int x;
    private int y;
    private int plane;

    // Constructor for an int object ID.
    public ObjectKey(int objectId, int x, int y, int plane) {
        this.objectId = objectId;
        this.x = x;
        this.y = y;
        this.plane = plane;
        this.objectName = null;
    }

    // Constructor for a String object name.
    public ObjectKey(String objectName, int x, int y, int plane) {
        this.objectId = -1; // You can use a specific value to indicate that it's not an object ID.
        this.objectName = objectName;
        this.x = x;
        this.y = y;
        this.plane = plane;
    }

    public ObjectKey(String objectName) {
        this.objectName = objectName;
    }

    public ObjectKey(int objectId) {
        this.objectId = objectId;
    }

    // Other methods like getters and matches method...

    public boolean matches(int objectId, int x, int y, int plane) {
        return (this.objectId == objectId || (this.objectName != null && this.objectName.equalsIgnoreCase(objectName)))
                && this.x == x && this.y == y && this.plane == plane;
    }

    public boolean matches(int objectId) {
        return this.objectId == objectId;
    }

    public boolean matches(String objectName) {
        return this.objectName != null && this.objectName.equalsIgnoreCase(objectName);
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getPlane() {
        return plane;
    }

    public int getId() {
        return objectId;
    }

    public String getName() {
        return objectName;
    }

}