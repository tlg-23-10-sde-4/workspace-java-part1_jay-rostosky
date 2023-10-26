package com.entertainment.client;

/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;
import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            printUsage();
            return;  // early return from main(), application exits
        }

        // 1: convert strings to proper types
        String brand = null;
        int volume = 0;
        DisplayType display = null;
        try {
            brand = args[0];
            volume = Integer.parseInt(args[1]);
            display = DisplayType.valueOf(args[2].toUpperCase());
        }
        catch (IllegalArgumentException e) {
            System.out.println("There is a problem with your inputs:");
            System.out.printf("You entered %s %s %s\n\n", args[0], args[1], args[2]);
            printUsage();
            return;
        }

        try {
            // 2: create a Television object from these 3 ingredients
            Television tv = new Television(brand, volume, display);

            // 3: congratulate them on their order and show the television
            System.out.println("Congratulations on your order, it will be there soon");
            System.out.println(tv);
        }
        catch (Exception e) {
            System.out.println(e.getMessage() + "\n");  // extracts the thrower's reason string
            printUsage();
        }
    }

    private static void printUsage() {
        String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
        String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
        String note1 = "Valid brands are " + Arrays.toString(Television.VALID_BRANDS);
        String note2 = String.format("Volume must be %s to %s", Television.MIN_VOLUME, Television.MAX_VOLUME);
        String note3 = "Note: supported displays are " + Arrays.toString(DisplayType.values());
        System.out.println(usage);
        System.out.println(example);
        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note3);
    }
}