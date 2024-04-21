import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.println("This sentence will have link break");
        // System.out.print
        System.out.print("This will not have break");
        System.out.print("This line will continue. \n");
        /*
         * String formatting using System.out.printf
         * %s String, %d Integral, %f floating point, %b boolean
         * This will also not break line
         */

        System.out.printf("Hello %s, good morning", "world");
        System.out.printf("The number is %d ", 10);
        // can use multiple formatter
        System.out.printf("\nThe floating %f and boolean %b", 10.3f, false);

        /*
         * User Input
         * import java.util.Scanner; // copy this line at the top of the code
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("\nThe following takes whole sentence");
        String wholeOutput = scan.nextLine();
        System.out.println("The input taken is " + wholeOutput);
        System.out.println("The following takes integer ");
        int intInput = scan.nextInt();
        System.out.println("The input taken is " + intInput);
        System.out.println("The following takes double ");
        double doubleInput = scan.nextDouble();
        System.out.println("The input taken is " + doubleInput);
        // Consume the newline character left by nextDouble
        scan.nextLine();
        System.out.println("The following takes boolean ");
        boolean booleanInput = scan.nextBoolean();
        System.out.println("The input take is " + booleanInput);
        scan.close(); // you must close the scanner once all input is taken

    }
}
