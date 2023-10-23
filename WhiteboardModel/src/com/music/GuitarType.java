package com.music;

public enum GuitarType {
    ACOUSTIC("acoustic"),
    ELECTRIC("electric"),
    CLASSICAL("classical");

    // everything under here is regular class definition stuff - fields, ctors, methods
    private final String display;

    GuitarType(String display) {
        this.display = display;
    }

    public String display() {
        return display;
    }

    public String toString() {
        return display();
    }
}