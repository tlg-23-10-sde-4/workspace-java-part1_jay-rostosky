package edu.math;

/*
 * An "all-static" class, i.e., one with nothing but static methods.
 */
class Calculator {

    // prevent instantiation from outside, this is an "all-static" class
    private Calculator() {
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns a random integer between 1 and 19 (inclusive).
     *
     * HINT: see a class called Math (package java.lang), look for a helpful here.
     * NOTE: the methods in the Math class are all "static," which means you call them as:
     *   Math.methodName()
     */
    public static int randomInt() {
        // delegate to the min-max version, passing 1 for the min, and 19 for the max
        return randomInt(1, 19);
    }

    /**
     * Returns a random integer between 'min' and 'max' (inclusive), e.g., 5 to 20.
     *
     * OPTIONAL CHALLENGE: implement this.
     */
    public static int randomInt(int min, int max) {
        double rand = Math.random();             // 0.0000 to  0.9999
        double scaled = rand * (max - min);      // 0.0000 to 14.9999
        double raised = scaled + min;            // 5.0000 to 19.9999
        return (int) raised;                     // 5      to 19
    }

    /*
     * Returns the average (arithmetic mean) of the supplied integers.
     *  getAverage(), or perhaps just average()
     *  getAvg()
     *  getMean()
     */
    public static double average(int first, int... rest) {  // first: 3   rest: [4, 5, 9, 15]
        double result = 0.0;

        double sum = first;
        for (int value : rest) {
            sum = sum + value;
        }

        result = sum / (rest.length + 1);
        return result;
    }
}