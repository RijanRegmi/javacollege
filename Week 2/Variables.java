
public class Variables {
    /*
     * Instance variable
     * will need object to access this variable
     */
    int instanceVariable = 100;
    /*
     * Static/class variable
     * No need of object, can be called for class
     * shared between the object
     */
    static int staticVariable = 20;

    public static void main(String[] args) {
        /* Non Primitive data type */
        /* Declearation */
        byte byteValue;
        /* Initialization */
        byteValue = 100;
        /* Declearation and Initialization */
        short shortValue = 200;
        /* Multiple declaration */
        int intValue1, intValue2;
        intValue1 = 10000;
        intValue2 = 2000;
        /* Multiple declaration and Initialization */
        long longVal1 = -9000, longVal2 = 9000;
        float floatValue = 90.90f; // The letter 'f' is needed
        double doubleValue = 100.897d; // The letter 'd' is optional
        char charValue = 'c'; // must use single quote
        boolean booleanValue = false;
        /* Illegal actions below */
        // byte byteValue = 100; //we cannot redeclare the variable
        // byteValue = 200; // instad use reassignmet
        // boolean boolVal2 = 'false'; //cannot use different type
        // byte byteValue2 = 100000000; //cannot exceed min and max

        /* Non primitive data type */
        String stringValue = "This is a string Value";
        /* Using class */
        System.out.println(stringValue);
        /* Object, for this we can use the same public class made */
        Variables variableObject = new Variables();
        /* Use boject from above to access instance variable */
        System.out.println(variableObject.instanceVariable);
        /* Use class to use static Value */

        /* Type casting */
        int intValueType = 100;
        double intValueConvertedToDouble = intValueType;
        /* Automatically cast from low datatype to high datatype */

        /* Explicit casting */
        // int intValueType = 190.8109;
        // int intValueConvertedToInt = (int) doubleValue;
        /* Manually specify data type for eg. (int) */
        /* Note this type cast can only be done in primitive data type */

    }

}
