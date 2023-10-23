package net.flix;

public enum Genre {
    HORROR("HORROR"),
    HISTORICAL("Historical"),
    ACTION("Action!!!"),
    COMEDY("Comedy :)"),
    SPORTS_ROMANCE("Sports Romance XO"),
    WESTERN("Western");

    // everything under here is regular class definition stuff: fields, ctors, methods
    private final String display;

    Genre(String display) {    // automatically private, by definition
        this.display = display;
        // System.out.println("Genre ctor called");
    }

    public String display() {  // standard getter method, it's just not named "getSomething"
        return display;
    }

    public String toString() {
        return display();      // generally better to call your own getter
    }
}