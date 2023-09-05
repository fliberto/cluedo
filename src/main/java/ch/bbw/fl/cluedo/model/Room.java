package ch.bbw.fl.cluedo.model;

public class Room {
    String name;
    int size;
    int amountDoors;
    int amountWindows;
    String wallColor;

    public Room(String name, int size, int amountDoors, int amountWindows, String wallColor) {
        this.name = name;
        this.size = size;
        this.amountDoors = amountDoors;
        this.amountWindows = amountWindows;
        this.wallColor = wallColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAmountDoors() {
        return amountDoors;
    }

    public void setAmountDoors(int amountDoors) {
        this.amountDoors = amountDoors;
    }

    public int getAmountWindows() {
        return amountWindows;
    }

    public void setAmountWindows(int amountWindows) {
        this.amountWindows = amountWindows;
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }
}
