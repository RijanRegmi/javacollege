import java.util.Scanner;

public class TaskToDo {
    public static void main(String[] args) {
        /*
         * 1. Write a program to check whether a person can cast a vote or not. The
         * condition is you must be over 18 years old to vote.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your age");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("You can cast vote");
        } else {
            System.out.println("You cannot cast vote");
        }

    }

}
