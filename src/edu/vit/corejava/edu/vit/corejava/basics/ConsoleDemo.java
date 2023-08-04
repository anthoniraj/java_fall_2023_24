package edu.vit.corejava.basics;

import java.io.Console;

/*
 * Demo Program for Input and Output using Console class
 * @author Anthoniraj Amalanathan
 * @since 03-Aug-2023
 */

public class ConsoleDemo {
    public static void main(String[] args) {
        /*
         * Practice: Write addition of two numbers program Get the two integer values from user
         * Use only Console for input and output 
         */
        Console con = System.console(); // Intialize Console 
        con.printf("%s" , "Enter Number: "); // Display Output
        String  name = con.readLine(); // Get Input (Always String Type)
        String password = String.valueOf(con.readPassword()); // Get Password
        con.printf("Welcome %s", name);

        /* Convert String Input to appropriate types */
        int x = Integer.parseInt(name);
        float f = Float.parseFloat(name);
    }
}
