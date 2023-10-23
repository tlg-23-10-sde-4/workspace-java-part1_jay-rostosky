/*
 * Application main-class, i.e., the class definition with the main() method.
 * Purpose: create a few instances of Television and give them a test-drive.
 */
class TelevisionClient {

    // application starting point - at runtime, the app starts here
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();

        // create an instance of Television and set its properties via setter calls
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        tv1.setDisplay(DisplayType.PLASMA);

        // create a 2nd instance of Television via the brand-volume-display ctor
        Television tv2 = new Television("Sony", Television.MAX_VOLUME, DisplayType.OLED);

        // create a third Television object by specifying only the brand in the ctor call
        Television tv3 = new Television("LG");

        // turn them all on
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();
        System.out.println();  // blank line in the output

        // turn them all off
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
        System.out.println();

        // show their toString() methods in action
        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        System.out.println(tv3);  // toString() automatically called
        System.out.println();

        System.out.println(Television.getInstanceCount() + " instances have been created");
    }
}