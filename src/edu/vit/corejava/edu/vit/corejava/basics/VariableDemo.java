package edu.vit.corejava.basics;

/*
 * Java Variable Demo
 * @author Anthoniraj Amalanathan
 * @since 03-Aug-2023
 */

public class VariableDemo {
    public static void main(String args[]) {
        /*
         * Primitive Data Types, Variables, and Naming Conventions (Camel Case)
         * int, float, double, char, boolean (true/false)
         * class String - for storing collection of characters
         */
        int value = 10; // Define variable
        float normalTemperature = 24.5f;
        double minimumBoilerTemperature = 100.5;
        char ch = 'Y';
        boolean flag = true;
        System.out.println(value);

        /*
         * Wrapper Class: Getting Memory Size, Maximum, and Min Value
         * Every primitive datatype -> Wrapper Classes
         * int -> Integer
         * float -> Float
         * char -> Character
         * long -> Long
         * double -> Double
         * boolean -> Boolean
         */
        System.out.println("Size of an Integer Type: " + (Integer.SIZE) / 8 + " Bytes");
        System.out.println("Minimum Range of Integer: " + Integer.MIN_VALUE);
        System.out.println("Maximum Range of Integer: " + Integer.MAX_VALUE);

        System.out.println("Size of Double Type: " + (Double.SIZE) / 8 + " Bytes");
        System.out.println("Minimum Range of Double: " + Double.MIN_VALUE);
        System.out.println("Maximum Range of Double: " + Double.MAX_VALUE);

        System.out.println("Size of Character Type: " + (Character.SIZE) / 8 + " Bytes");
        System.out.println("Minimum Range of Character: " + (int) Character.MIN_VALUE);
        System.out.println("Maximum Range of Character: " + (int) Character.MAX_VALUE);
    }
}
