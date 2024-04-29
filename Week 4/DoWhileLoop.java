import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int num1 = 0;
        while (num1 < 0) {
            System.out.println("while checks condition first");
        }

        /* Do while checks condition after first interation */
        do {
            System.out.println("Do while checks condition after");
        } while (num1 < 0);
        /* This means do while loop runs at least once */

        Scanner scan = new Scanner(System.in);

        // System.out.println("Enter a number");
        // int num2 = scan.nextInt();

        // while (num2 > 0) {
        // System.out.println("Enter Negative Number ");
        // num2 = scan.nextInt();
        // }

        System.out.println("End loop");

        System.out.println("Please enter a number");
        int input = scan.nextInt();
        while (input >= 0) {
            System.out.println("Please enter negative number");
            input = scan.nextInt();
        }
        System.err.println("The negative value is" + input);
        scan.close();

    }

}
