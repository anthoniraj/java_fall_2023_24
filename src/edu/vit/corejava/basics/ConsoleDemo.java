package basics;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        /*
         * Write addition of two numbers program
         * Get the two integer values from user
         * Use only Console for input and output
         * import java.io.Console;
         */
        Console con = System.console();
        System.out.println("Enter your name: ");
        con.printf("%s" , "Enter Number: ");
        String  name = con.readLine();
        int x = Integer.parseInt(name);
        float f = Float.parseFloat(name);
        con.readPassword();
        con.printf("Welcome %s", name);
    }
}
