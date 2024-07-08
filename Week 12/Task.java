public class Task {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = number1 - 10;
        try {
            int number3 = number1 / number2;
        } catch (ArithmeticException ex) {
            System.out.println("can't divide by zero");
        }

        String name = null;
        try {
            System.out.println(name.length());
        } catch (NullPointerException ex) {
            System.out.println("String is empty");
        }

        String[] names = new String[100];
        names[0] = "Ram";
        try {
            names[110] = "Oskar";
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("I caught an exception");
        } finally {
            System.out.println("Program stops");
        }
    }
}
