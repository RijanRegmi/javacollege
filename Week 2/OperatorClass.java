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

        /* unary operators */
        int uNumber1 = 10;
        uNumber1++; // meaning uNumber 1 = uNumber1 + 1;
        System.out.println("Unrart for increament is ++ " + uNumber1);
        uNumber1--;
        System.out.println("Unrart for increament is -- " + uNumber1);

        /* Ternary operator */
        int tNumber1 = 10, tNumber2 = 10;
        boolean tExpression = tNumber1 == tNumber2;
        /*
         * one line if else, see the given example in if else
         * string output;
         * if(tExpression == true){
         * output = "True statment";
         * }else{
         * output = "False statment";
         * }
         */
        String output = tExpression ? "True Statement" : "Fales Statement";
        /*
         * Here we can assigne a string out with one expression
         * if expression is true it will return the value after the "?"
         * if the expression is false it will return the value after the ":"
         */
        int numberOutput = tNumber1 < tNumber2 ? 10 : 20;
        System.out.println(output);
        System.out.println(numberOutput);
    }

}
