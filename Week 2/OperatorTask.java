public class OperatorTask {
    public static void main(String[] args) {
        int aNumber1 = 19;
        System.out.println("The number is equals to or greater then 18 or not is " + (aNumber1 >= 18));

        float amount = 120;
        float time = 9;
        float rate = 5;
        float si = amount * time * rate / 100;
        System.out.println("Simple interest is " + si);

        int l = 10;
        int b = 8;
        int a = l * b;
        int p = 2 * (l + b);
        System.out.println("The area is " + a);
        System.out.println("The perimeter is " + p);

        int aNumber2 = 18;
        boolean tExpression = aNumber1 >= aNumber2;
        System.out.println("The number is equals to or greater then 18 or not is " + tExpression);

    }
}
