import java.util.Scanner;

public class TaskToDo {
    public static void main(String[] args) {
        /*
         * 1. Write a program to check whether a person can cast a vote or not. The
         * condition is you must be over 18 years old to vote.
         */

        Scanner scan = new Scanner(System.in);

        // System.out.println("Enter Your age");
        // int age = scan.nextInt();

        // if (age >= 18) {
        // System.out.println("You can cast vote");
        // } else {
        // System.out.println("You cannot cast vote");
        // }

        /* Write a program to calculate SI */
        // System.out.println("Enter Principal Amount");
        // float p = scan.nextFloat();

        // System.out.println("Enter Interest Rate");
        // float r = scan.nextFloat();

        // System.out.println("Enter Time in year");
        // float t = scan.nextFloat();

        // float si = (p * r * t) / 100;

        // System.out.println("The Simple Interest is "+si);

        System.out.println("Enter the length");
        float l = scan.nextFloat();

        System.out.println("Enter the width");
        float w = scan.nextFloat();

        System.out.println("Enter the height");
        float h = scan.nextFloat();

        System.out.println("Enter side");
        float s = scan.nextFloat();

        float cuboid = l * w * h;

        float cube = s * s * s;

        System.out.println("The volume of Cuboid is " + cuboid);
        System.out.println("The volume of Cube is " + cube);

    }

}
