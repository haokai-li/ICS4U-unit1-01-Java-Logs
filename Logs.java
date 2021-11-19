/*
* The "Hello Word!" program, just proves you can show print to terminal.
*
* @author  Haokai
* @version 1.0
* @since   2021-11-17
*/

import java.util.Scanner;

/**
* This is the standard "logs" program.
*/

final class Logs {
    /**
    * Max take variable.
    */
    public static final double MAX = 1100;
    /**
    * Weigh variable.
    */
    public static final double WEIGH = 20;
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Logs() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final double myAnswer;
        final Scanner myObj = new Scanner(System.in);
        System.out.print("Enter log length (0.25, 0.5 or 1): ");

        final float length = myObj.nextFloat();

        myAnswer = (MAX / WEIGH) / length;

        System.out.println("The truck will be able to take "
                 + myAnswer + " logs that are " + length
                 + " mether(s) in length.");

        System.out.println("\nDone.");
    }
}

