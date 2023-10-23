package com.tick;

/*
 * Client-side main-class focused on validation testing.
 *
 * BVT (Boundary Value Testing) - we test on the boundaries and just outside them.
 *  0,1  and  20,21
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);     // no error, value should "stick" (accepted)
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());  // should be 1

        clock.setSnoozeInterval(20);    // no error, value should stick
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());  // should be 20

        clock.setSnoozeInterval(0);     // error message, value rejected
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());  // should still be 20

        clock.setSnoozeInterval(21);    // error message, value rejected
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());  // should still be 20
    }
}