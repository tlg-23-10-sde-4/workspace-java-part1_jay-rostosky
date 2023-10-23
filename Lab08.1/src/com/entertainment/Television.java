package com.entertainment;

import java.util.Arrays;

/*
 * Business class to model the workings of a television.
 */
public class Television {
    // class-level shared (static) variables - one copy of these, up in the common area
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = { "Samsung", "Sony", "LG", "Toshiba" };

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // attributes or properties - aka "fields" or "instance variables" in Java
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;  // otherwise, default is null (all class types)

    // Television HAS-A Tuner [Television] -> [Tuner]
    private final Tuner tuner = new Tuner();  // instantiated internally, not exposed (no get/set)

    // for muting behavior
    private boolean isMuted;  // provide getter, only
    private int oldVolume;    // completely hidden, no get/set methods

    // constructors
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();             // delegate to no-arg ctor for the increment
        setBrand(brand);    // delegate to setter for any validation it might be doing
    }

    public Television(String brand, int volume) {
        this(brand);        // delegate to 1-arg ctor above me for brand
        setVolume(volume);  // handle volume myself, delegating to the setter for any validation
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // business "action" methods
    public void changeChannel(String channel) {
        tuner.setChannel(channel);  // delegate to contained Tuner object (a component part)
    }

    public String getCurrentChannel() {
        return tuner.getChannel();  // delegate to contained Tuner object
    }

    public void mute() {
        if (!isMuted()) {  // not currently muted, emitting sound (volume is 32)
            oldVolume = getVolume();
            setVolume(0);  // make it go quiet (you can also use MIN_VOLUME here)
            isMuted = true;
        }
        else {             // we are currently muted, so restore volume from oldVolume
            setVolume(oldVolume);  // back to 32
            isMuted = false;
        }
    }

    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " television to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    // accessor methods - provide "controlled access" to the object's fields
    public boolean isMuted() {
        return isMuted;
    }

    public String getBrand() {
        return brand;
    }

    // Use VALID_BRANDS here instead of hardcoded magic strings "Samsung", "Sony", ...

    public void setBrand(String brand) {
        boolean valid = false;

        if (isValidBrand(brand)) {  // delegate to private method
            this.brand = brand;
        }
        else {
            System.out.printf("Invalid brand: %s. Must be one of %s.\n",
                    brand, Arrays.toString(VALID_BRANDS));
        }
    }

    // VALID_BRANDS looks like this ["Samsung", "Sony", "LG", "Toshiba"]
    // Lab p.81 (very bottom of notes): why does it make sense for this method to be static?
    public static boolean isValidBrand(String brand) {
        boolean valid = false;

        for (String currentBrand : VALID_BRANDS) {
            if (brand.equals(currentBrand)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;  // automatically unmuted
        }
        else {
            System.out.printf("Invalid volume: %s. Must be between %s and %s.\n",
                    volume, MIN_VOLUME, MAX_VOLUME);

//            System.out.println("Invalid volume: " + volume + ". " +
//                    "Must be between " + MIN_VOLUME + " and " + MAX_VOLUME + ".");
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private boolean verifyInternetConnection() {
        return true;  // fake implementation
    }

    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand=%s, volume=%s, display=%s, currentChannel=%s",
                getBrand(), volumeString, getDisplay(), getCurrentChannel());

//        return "Television: brand=" + getBrand() +
//                ", volume=" + volumeString +
//                ", display=" + getDisplay();
    }
}