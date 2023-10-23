package com.music.test;

import com.music.Guitar;

/*
 * main-class for testing correct functionality of setStrings().
 *  setStrings() will only accept 6 or 12.
 */
class GuitarValidationTest {

    public static void main(String[] args) {
        Guitar g = new Guitar();

        g.setStrings(6);                                   // should stick
        System.out.println("strings: " + g.getStrings());  // should be 6

        g.setStrings(12);                                  // should stick
        System.out.println("strings: " + g.getStrings());  // should be 12

        g.setStrings(1);                                   // error message, 1 is rejected
        System.out.println("strings: " + g.getStrings());  // should still be 12
    }
}