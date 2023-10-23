package com.tick;

/*
 * Class definition to model the workings of an alarm clock.
 * This is called a "business class" or "system class," as it contains
 * business things (attributes and methods).
 * This class definition does NOT have a main() method - most don't.
 */
class AlarmClock {
    // shared (static) variables - only one copy of these, live in the class-wide common area
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    // properties or attributes - in Java, we call these "instance variables" or "fields"
    private int snoozeInterval = 5;  // default value when client doesn't specify (instead of 0)

    // constructors - these get called when the client says "new"
    public AlarmClock() {
        // no-op
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);  // delegate to setter for any validation/conversion
    }

    // functions or operations - in Java, we call these "methods"
    public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }

    // accessor methods - provide "controlled" access to the object's fields
    // this allows us to do things like data validation, i.e., enforcing constraints
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // enforce the data constraint -> must be between 1 and 20 (inclusive)
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snooze interval: " + snoozeInterval + ". " +
                    "Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + ".");
        }
    }

    public String toString() {
        return "AlarmClock: snoozeInterval=" + getSnoozeInterval();
    }
}