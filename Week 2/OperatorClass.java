public class OperatorClass {
    public static void main(String[] args) {
        /* Arthemitc Opereators */
        int a = 10, b = 10;
        int sum = a + b; // here the "+" is an Arthemitc Opereators
        System.out.println("Adding for a+b is " + sum);
        System.out.println("Difference for a-b is " + (a - b));
        System.out.println("Multiplication for a*b is " + (a * b));
        System.out.println("Division for a/b is " + (a / b));
        System.out.println("Modulo for a and b is " + (a % 2));

        /* Assigment Operator */
        int aNumber1;
        aNumber1 = 10;
        /* or declare and assign */
        int aNumber2;
        aNumber2 = 20;
        /* assign with another variable */
        int aNumber3 = aNumber1;
        System.out.println("Assigment with += " + (aNumber1 += 10));
        aNumber2 -= 30; // same as aNumber2 = aNumber2 - 30
        System.out.println("Assigment with -= " + (aNumber2));

    }

}
