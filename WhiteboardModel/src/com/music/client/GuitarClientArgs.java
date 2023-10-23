package com.music.client;

import com.music.Guitar;
import com.music.GuitarType;
import java.util.Arrays;

/*
 * Client main-class that allows a user to specify values for the properties
 * in an instance of Guitar.  Analogous to a guitar ordering system.
 *  Example execution of the client from the command line:
 *  $ java GuitarClientArgs Fender ELECTRIC 6
 */
class GuitarClientArgs {

    public static void main(String[] args) {
        if (args.length < 3) {
            printUsage();
            return;
        }

        // we know we have at least 3 arguments, so safe to proceed
        // any arguments after the 3rd one are simply ignored
        String brand    = args[0];
        GuitarType type = GuitarType.valueOf(args[1].toUpperCase());
        int strings     = Integer.parseInt(args[2]);
        Guitar guitar = new Guitar(brand, type, strings);
        printOrder(guitar);
    }

    private static void printOrder(Guitar guitar) {
        String order =
                "Thank you for your order.\n" +
                "Your guitar will arrive with the following properties:\n" + guitar;
        System.out.println(order);
    }

    private static void printUsage() {
        String types = Arrays.toString(GuitarType.values());

        String usage =
                "Usage: java GuitarClientArgs <brand> <type> <strings>\n" +
                "Available types are " + types.substring(1, types.length() - 1) + "\n" +
                "All guitars available are 6- or 12-string models\n" +
                "Examples:\n" +
                "  java GuitarClientArgs Fender electric 6\n" +
                "  java GuitarClientArgs Gibson acoustic 12\n" +
                "  java GuitarClientArgs Goya classical 6";
        System.out.println(usage);
    }
}