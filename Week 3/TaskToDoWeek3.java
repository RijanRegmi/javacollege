import java.util.Scanner;

public class TaskToDoWeek3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1. Write a JAVA program to find the maximum between three numbers.
        System.out.println("Enter the First number");
        int a = scan.nextInt();
        System.out.println("Enter the second Number");
        int b = scan.nextInt();
        System.out.println("Enter the third number");
        int c = scan.nextInt();
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.printf("%d is maximum", max);

        // 2. Write a JAVA program to check whether a number is negative, positive, or
        // zero.
        System.out.println("Enter the number");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is Zero");
        }

        // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or
        // not.
        System.out.println("Enter the number");
        int x = scan.nextInt();
        if (x % 5 == 0 && x % 11 == 0) {
            System.out.println("The number is divisible by 5 and 11");
        } else {
            System.out.println("The number is not divisible by 5 and 11");
        }

        // 4. Write a JAVA program to check whether a number is even or odd.
        System.out.println("Enter the number");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        // 5. Write a JAVA program to check whether a year is a leap year or not.
        // Hint: if year%4==0; if year%100!==0 ; year%400==0;
        System.out.println("Enter year");
        int y = scan.nextInt();
        if (y % 4 == 0) {
            System.out.println("The year is leap year");
        } else if (y % 100 == 0) {
            System.out.println("The year is leap year");
        } else if (y % 400 == 0) {
            System.out.println("The year is leap year");
        } else {
            System.out.println("The year is not leap year");
        }

        // 6. Write a JAVA program to input any alphabet and check whether it is vowel
        // or consonant.
        System.out.println("Enter any alphabet:");
        String s = scan.nextLine();
        char ch = s.charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("The alphabet is a vowel.");
        } else {
            System.out.println("The alphabet is a consonant.");
        }

        // Some Switch case Statements Questions:

        // 1. Write a Java program that takes a student's grade as input (A, B, C, D, or
        // F) and
        // converts it to the corresponding GPA value. Use a switch case statement to
        // handle different grades
        System.out.println("Enter your grade");
        String s = scan.nextLine();
        char grade = s.charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("4.0");
                break;
            case 'B':
                System.out.println("3.0");
                break;
            case 'C':
                System.out.println("2.0");
                break;
            case 'D':
                System.out.println("1.0");
                break;
            case 'F':
                System.out.println("0.0");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        // 2. Create a Java program that takes two numbers and an operator (+, -, *, /)
        // as
        // inputs and performs the corresponding arithmetic operation using a switch
        // case statement.
        System.out.println("Enter first number");
        int a = scan.nextInt();
        System.out.println("Enter operator");
        char op = scan.next().charAt(0);
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        switch (op) {
            case '+':
                System.out.println("The addition is " + a + b);
                break;
            case '-':
                System.out.println("The subtraction is " + (a - b));
                break;
            case '*':
                System.out.println("The multiplication is " + a * b);
                break;
            case '/':
                System.out.println("The divison is " + a / b);
                break;
            default:
                System.out.println("Not found");
                break;
        }

        // 3. Write a Java program that takes an integer input (1 to 12) representing a
        // month and
        // prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer,
        // 10-12: Fall) using a switch case
        System.out.println("Enter the number between 1 to 12");
        int a = scan.nextInt();
        switch (a) {
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("summer");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("fall");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        // 4. Implement a Java program that calculates the area of different shapes
        // (circle, rectangle, square, triangle)
        // based on the user's choice using a switch case.
        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");

        int choice = scan.nextInt();
        double area = 0;

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scan.nextDouble();
                area = Math.PI * radius * radius;
                break;
            case 2:
                System.out.println("Enter the length and width of the rectangle:");
                double length = scan.nextDouble();
                double width = scan.nextDouble();
                area = length * width;
                break;
            case 3:
                System.out.println("Enter the side length of the square:");
                double side = scan.nextDouble();
                area = side * side;
                break;
            case 4:
                System.out.println("Enter the base and height of the triangle:");
                double base = scan.nextDouble();
                double height = scan.nextDouble();
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        if (choice >= 1 && choice <= 4) {
            System.out.println("The area of the chosen shape is: " + area);
        }

        scan.close();

    }
}
