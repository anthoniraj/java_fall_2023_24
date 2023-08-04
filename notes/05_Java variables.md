# Variable in Java
- Author: `Anthoniraj Amalanathan`
- Date: 03-Aug-2022

- Variable is a container to hold a value in memory
- Syntax
    1. datatype variableName = value;
        minTemperature
        boilerMinimumTemperature
        e.g. int value = 10;
    2. var variableName = value; (since jdk 11)
- Data Binding - Static Vs Dynamic
- Datatype (JVM Memory - Java Virtual Machine)
    - primitive (int, float, double, char, byte, long, boolean)
    - non-primitive (String, Console, List ... )

## Wrapper Class
- mechanism to convert primitive type into object
    - int => Integer
    - float => Float
    - double => Double
    - boolean => Boolean

```java
package edu.vit.corejava.basics;

/*
 * Variable Demo
 * @author Anthoniraj Amalanathan
 * @since 28-Jul-2022
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
```    
- Output
```console
    10
    Size of an Integer Type: 4 Bytes
    Minimum Range of Integer: -2147483648
    Maximum Range of Integer: 2147483647
    Size of Double Type: 8 Bytes
    Minimum Range of Double: 4.9E-324
    Maximum Range of Double: 1.7976931348623157E308
    Size of Character Type: 2 Bytes
    Minimum Range of Character: 0
    Maximum Range of Character: 65535
```

## Types of variables in Java
    1. local variable
    2. static variable
    3. instance variable

## Constant in Java
- value that cannot be changed.
- Syntax: `static final datatype IDENTIFIER_NAME=value;`

```java
    public class ConstantDemo {
        public static final double PI = 311415;
        public static final int MIN_CREDITS = 16;
    }
```


