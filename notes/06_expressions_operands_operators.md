# Java Expressions
An expression is a combination of one or more operands, zero or more operators, and zero or more pairs of parentheses. 
- Example expression:
    - x+y => x, y are operands and + is operator
    - 9+(8*5)/2
- operands: what items to apply the action to
- operators: what action or operation to perform.
    - Arithmetic Operators (+, -, *, /, %, ++, --)
        x++ => x = x + 1 => x += 1
    - Assignment Operators (=, +=, *= ...)
        int x = 10;
    - Comparison Operators (==, !=, >, <, >=, <=)
    - Logical Operators (&&, ||, !)
- parentheses: 
    - (x+3y) + 3 / (n+5)

## Practice Program
A spinner of radius is divided into 4 equal sectors. Find the area of each of the
sectors. 
- Get radius from the Console
- Use Constant for PI (Understand static variable and final keyword)
- Use Console for Input and Output
- Use pow() method for calculation

```java
package edu.vit.corejava.basics;
/*
 * Define the constant in class beginning
 * create main method
 * get the radius using Console readLine() method
 * convert into double using Double.parseDouble(radius)
 * do the computation
 * double areaOfSector = (1/4) * PI * Math.pow(radius, 2)
 * display the areaOfSector
 * 
 */

import java.io.Console;

public class Spinner {
    public static final double PI = 3.1415;
    public static void main(String[] args) {
        Console console = System.console();
        String input = console.readLine("Enter radius");
        double radius = Double.parseDouble(input);
        double areaOfSector = (1/4.0) * PI * Math.pow(radius, 2);
        console.printf("%.3f", areaOfSector);
    }
}
/*

*/
```