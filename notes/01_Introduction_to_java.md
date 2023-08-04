# Introduction to Java
- Author: `Anthoniraj Amalanathan`
- Date(s): 24-Jul-2023

## Course: Computer Programming: Java
- Computer
    - A machine or electronic device that can store and process information
    - Von neumann Architecture
        - Input (Keyboard)
        - Process (CPU )
        - Storage (RAM and SSD)
        - Output (Monitor)
    - Computer will understand only Binary System (0/1)
- Program 
    - Program is set of commands or instructions to the computer to do a task or job
- Java
    - Java is a general purpose, object oriented, functional programming language. 
    - Java has both Compiler(javac) and Interpreter (java)
        - Compiler: Scan ALL the statements at once and translate the code
        - Interpreter: Scan one statement at a time and translate it

## Simple Java Program
```java

/*
 * Demo "Hello World" Java Program
 * @author Anthoniraj Amalanathan
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
- To compile the Java Program
    - `javac App.java`
- To run the Java Program
    - `java App` (without .class or .java extension)
- To view the Bytecode
    - `javap -c App`

## JDK vs JRE vs JVM
- JDK - Java Development Kit (for javac, javap, jconsole, jheap)
- JRE - Java Runtime Environment ( for basic libraries)
- ByteCode - Intermediate Code for WORA (Write Once Run Anywhere)
- JVM - Java Virtual Machine (java - for translating Bytecode into Binary)

<img src="../images/jdk_jre_jvm_01.png" alt="jvm"  width="30%" height="30%"/>

## Java Versions
- JDK 1.8 is the major version in Java (Functional Programming Introduced)
- JDK 17 is the Stable Long Term Version for Development  

## JDK Flavours
- JDK: OpenJDK comes in many flavors
	- Oracle JDK
	- Microsoft OpenJDK (Recommended for Windows OS)
	- Amazon Correcto
	- Eclipse Temurin	
	- Belsoft OpenJDK

## Reference
- Java Bytecode Reference: https://javaalmanac.io/
- JDK vs JRE vs JVM: https://www.javacodemonk.com/difference-between-jdk-jre-and-jvm-6380989d