public class FunctionClass {
    /* Write a function inside a class */
    void printSomething() {
        System.out.println("This Function prints");
    }

    /* In the function void means nothing/null */

    /* With return type as int */
    int returnInteger() {
        int returnThis = 1;
        return returnThis;
    }

    /* With return and params */
    boolean returnString(int num1, int num2) {
        boolean check = num1 == num2;
        return check;
    }

    public static void main(String[] args) {
        /* To use a function you need to make object */
        /* Note: just remember the syntax for now */
        FunctionClass fc = new FunctionClass();
        fc.printSomething();

        /* you can call this functionb anything in need */
        fc.printSomething();

        int callIntFunction = fc.returnInteger();
        System.out.println("Function with return Int " + callIntFunction);
    }

}
