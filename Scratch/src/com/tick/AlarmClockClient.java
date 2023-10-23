package com.tick;

/*
 * Application main-class, i.e., the class definition with the main() method.
 *
 * Its purpose is to create a few instances of AlarmClock and give them
 * a basic test-drive.
 */
class AlarmClockClient {

    // application "entry point" or starting point - the app starts from here
    public static void main(String[] args) {
        // create an instance of AlarmClock and set its properties
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        // create a 2nd instance of AlarmClock and set its properties also
        AlarmClock clock2 = new AlarmClock(AlarmClock.MAX_INTERVAL);  // as long as it can

        // create a 3rd AlarmClock object, but DON'T set its properties - so what will they be?
        AlarmClock clock3 = new AlarmClock();

        // call methods on them
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        System.out.println();

        // show their toString() methods in action
        System.out.println(clock1.toString());
        System.out.println(clock2);  // toString() automatically called
        System.out.println(clock3);  // toString() automatically called
    }
}