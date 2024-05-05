public class StaticFunction {
    /* in the following public and static is optional */
    public static int addTwoNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static String vendingMachine(int menu) {
        if (menu == 1) {
            return "Coke";
        }
        if (menu == 2) {
            return "Water";
        }
        if (menu == 3) {
            return "Frooti";
        }
        return "Nothing";
    }

    /* Task 1 */
    public static Boolean CheckEven(int num) {
        Boolean check = num % 2 == 0;
        return check;
    }

    /* Task 2 */
    public static String CheckEligible(String name, int age) {
        if (age <= 18) {
            return "Sorry " + name + ", you are not eligible";
        }

        return "Congratulation " + name + ", you are eligible";

    }

    /* Task 3 */
    public static double amkeMultiply(double num1, double num2) {
        return num1 * num2;

    }

    public static void main(String[] args) {
        // If a function is static no need to make
        // If the function is static in same class yo can simple call the method

        int sumReturn = addTwoNumber(10, 30);
        System.out.println("The sum is " + sumReturn);

        String frooti = vendingMachine(3);
        System.out.println("Frooti check " + frooti);

        Boolean checking = CheckEven(13);
        System.out.println("This is Even " + checking);

        String eli = CheckEligible("Rijan", 20);
        System.out.println(eli);

        double multiply = amkeMultiply(3, 4);
        System.out.println(multiply);

    }
}
