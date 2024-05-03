import java.util.Scanner;

public class TaskToDoWeek2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1. Write a program to check whether a person can cast a vote or not. The
        // condition is you must be over 18 years old to vote.

        System.out.println("Enter Your age");
        int age = scan.nextInt();

        String result = (age >= 18) ? "You can cast vote"
        : "You cannot cast vote";
        System.out.println(result);
        scan.close();

        /* 2. Write a program to calculate SI */

        System.out.println("Enter Principal Amount");
        float p = scan.nextFloat();

        System.out.println("Enter Interest Rate");
        float r = scan.nextFloat();

        System.out.println("Enter Time in year");
        float t = scan.nextFloat();

        float si = (p * r * t) / 100;

        System.out.println("The Simple Interest is "+si);

        // 3. Write a program to calculate, area of the triangle, and the Volume of the
        // Cube and Cuboid.

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

        // 4. Write the ternary operator for question no. 1

        System.out.println("Enter Your age");
        int age = scan.nextInt();

        String result = (age >= 18) ? "You can cast vote"
        : "You cannot cast vote";
        System.out.println(result);
        scan.close();

        // 5. Write a program to take two integer inputs from the user and print the sum
        // and product of them.

        System.out.println("Enter a Number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter another Number: ");
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println("The sum of two number is: " + sum);
        System.out.println("The product of two number is: " + product);

        // 6. Take two integer inputs from the user. First, calculate the sum of two,
        // then the product of two. Finally, calculate the division of the thus obtained
        // sum and product and print the result.

        System.out.println("Enter a Number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter another Number: ");
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        float division = product / sum;

        System.out.println("The division of their sum and product is: " + division);

        // 7. Take the name, roll number, and field of interest from the user and print
        // in the format below: Hey, my name is XYZ and my roll number is XYZ. My field
        // of interest are xyz.

        System.out.println("Enter your Name: ");
        String name = scan.nextLine();

        System.out.println("Enter your Roll NO. : ");
        String rollno = scan.nextLine();

        System.out.println("Enter your Field: ");
        String field = scan.nextLine();

        System.out.println(
                "Hey, my name is " + name + " and my roll number is " + rollno + ". My field of interest are " + field);


        /*8. Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.*/

        System.out.print("Enter the side of the square: ");
        double side = scan.nextDouble();
 
        // Calculate area and perimeter of square
        double areaSquare = side * side;
        double perimeterSquare = 4 * side;
 
        System.out.println("Area of the square: " + areaSquare);
        System.out.println("Perimeter of the square: " + perimeterSquare);
 
        // Take input for Simple Interest
        System.out.print("\nEnter principal amount: ");
        double principal = scan.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = scan.nextDouble();
        System.out.print("Enter time period (in years): ");
        double time = scan.nextDouble();
 
        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
 
        // Take input for base and height of triangle
        System.out.print("\nEnter the base of the triangle: ");
        double base = scan.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scan.nextDouble();
 
        // Calculate area of triangle
        double areaTriangle = 0.5 * base * height;
        System.out.println("Area of the triangle: " + areaTriangle);
 
        // Take input for side of cube
        System.out.print("\nEnter the side of the cube: ");
        double sideCube = scan.nextDouble();
 
        // Calculate volume of cube
        double volumeCube = sideCube * sideCube * sideCube;
        System.out.println("Volume of the cube: " + volumeCube);
 
        // Take input for dimensions of cuboid
        System.out.print("\nEnter the length of the cuboid: ");
        double length = scan.nextDouble();
        System.out.print("Enter the breadth of the cuboid: ");
        double breadth = scan.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double heightCuboid = scan.nextDouble();
 
        // Calculate volume of cuboid
        double volumeCuboid = length * breadth * heightCuboid;
        System.out.println("Volume of the cuboid: " + volumeCuboid);



        /*9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */

        System.out.println("Enter Lenght");
        double l = scan.nextDouble();
        System.out.println("Enter Breadth");
        double b = scan.nextDouble();

        double area = l * b;
 
        int areaInt = (int) area;
        System.out.println("Area of the rectangle (type casted to int): " + areaInt);


        /*10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;

        a. If equal to or more than 70 -> First Class

        b. If more than 59 -> Upper Second Class

        c. If more than 49 -> Second class

        d. If more than 39 -> Third class and if below than 40 the result is fail. 

        Hint: Use ternary operator */

        System.out.print("Enter marks for subject 1: ");
        int subject1 = scan.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int subject2 = scan.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int subject3 = scan.nextInt();
        System.out.print("Enter marks for subject 4: ");
        int subject4 = scan.nextInt();
 
        int totalMarks = subject1 + subject2 + subject3 + subject4;
 
        double percentage = (totalMarks / 4.0);
 
        String result = (percentage >= 70) ? "First Class" :
                        (percentage > 59) ? "Upper Second Class" :
                        (percentage > 49) ? "Second Class" :
                        (percentage > 39) ? "Third Class" : "Fail";
 
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + result);
 
        scan.close();
        }








    }

}
