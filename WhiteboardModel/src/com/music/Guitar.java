package com.music;

/*
 * Business class for WhiteboardModel code review assignment.
 */
public class Guitar {
    // properties or attributes, we call them "instance variables" or "fields"
    private String brand;
    private GuitarType type;
    private int strings = 6;  // constraint: 6, 12 (default 6)

    // constructors
    public Guitar() {
    }

    public Guitar(String brand) {
        setBrand(brand);
    }

    public Guitar(String brand, GuitarType type) {
        this(brand);
        setType(type);
    }

    public Guitar(String brand, GuitarType type, int strings) {
        this(brand, type);
        setStrings(strings);
    }

    // business or "action" methods
    public void changeStrings() {
        System.out.println("Changing all " + getStrings() + " strings");
    }

    public void tune() {
        System.out.println("Tuning your " + getBrand() + " " + getStrings() + "-string " + getType().display() + " guitar");
    }

    public void play(String song) {
        System.out.println("Playing '" + song + "'");
    }

    // accessor (get/set) methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public GuitarType getType() {
        return type;
    }

    public void setType(GuitarType type) {
        this.type = type;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        if (strings == 6 || strings == 12) {
            this.strings = strings;
        }
        else {
            System.out.println("Invalid number of strings: " + strings + ". Must be 6 or 12.");
        }
    }

    public String toString() {
        return "Guitar: brand=" + getBrand() + ", type=" + getType() + ", strings=" + getStrings();
    }
}