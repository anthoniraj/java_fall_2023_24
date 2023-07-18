package edu.vit.corejava.basics;

/*
 * Demo Program for Input and Output
 * @author Anthoniraj Amalanathan
 * @since 28-Jul-2022
 */

public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println(args[0] + " " + args[1]);
    }
}

/*
 * Compile: javac CommandLineArguments.java
 * Run: java CommandLineArguments 10 20
 * Output: 10 20
 */