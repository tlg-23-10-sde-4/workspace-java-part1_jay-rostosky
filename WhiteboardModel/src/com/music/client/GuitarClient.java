package com.music.client;

import com.music.Guitar;
import com.music.GuitarType;

/*
 * Client main-class for test-driving a few instances of Guitar.
 */
class GuitarClient {

    public static void main(String[] args) {
        // create a Guitar object and set its properties via individual setter calls
        Guitar g1 = new Guitar();
        g1.setBrand("Fender");
        g1.setType(GuitarType.ELECTRIC);

        // then call methods on it
        g1.changeStrings();
        g1.tune();
        g1.play("Owner of a Lonely Heart");

        System.out.println();  // blank line, for better readability in the output

        // create another instance via the 3-arg constructor
        Guitar g2 = new Guitar("Gibson", GuitarType.ACOUSTIC, 12);

        g2.changeStrings();
        g2.tune();
        g2.play("Stairway to Heaven");

        System.out.println();

        // show their toString() methods in action
        System.out.println(g1.toString());
        System.out.println(g2);  // toString() automatically called
    }
}