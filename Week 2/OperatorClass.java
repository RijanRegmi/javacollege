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

        /* Relational operators */
        int rNumber1 = 10, rNumber2 = 20;
        System.out.println("rNumber equals to rNumber2? " + (rNumber1 == rNumber2));
        System.out.println("rNumber greater then rNumber2? " + (rNumber1 > rNumber2));
        System.out.println("rNumber lessthen or equals to rNumber2? " + (rNumber1 <= rNumber2));
        System.out.println("rNumber not equals to rNumber2? " + (rNumber1 != rNumber2));

        /* logic operators */
        int lNumber1 = 10, lNumber2 = 12;
        boolean lExpression1 = lNumber1 == lNumber2;
        boolean lExpression2 = lNumber1 <= lNumber2;
        System.out.println("And operators users && " + (lExpression1 && lExpression2));
        System.out.println("Or operators users || " + (lExpression1 || lExpression2));
        System.out.println("Not operators users ! " + !lExpression1);

    }

}
