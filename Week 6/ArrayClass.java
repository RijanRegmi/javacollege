
public class ArrayClass {
    public static void main(String[] args) {
        /* To create an array define datatype followed by[] */
        int[] myFirstArray;
        /* Initializing the array we need new refrence */
        myFirstArray = new int[6]; // Here the new int[6] -> 6 refres to the size of array
        /* The size of an array can be further access by length */
        int myFirstArrayLength = myFirstArray.length;
        System.out.println("My First array size is " + myFirstArrayLength);

        /* Using index for array operation */
        myFirstArray[0] = 10;
        myFirstArray[1] = 30;
        myFirstArray[2] = 100;

        /* To print the array use the same index */
        System.out.println("The element is in 0 index " + myFirstArray[0]);
        /* Can also create a new int value */
        int secondArrayIndex = myFirstArray[1];
        System.out.println("The Second element store " + secondArrayIndex);

        /* Declaration and Initialization */
        int[] myThirdArray = { 10, 20, 30, 0, 100 };
        /* Or using constructior */
        int[] myFourthArray = new int[] { 1, 2, 3, 4 };
        System.out.println(myFourthArray[2]);

        int[] myFifthArray = new int[] { 10, 20, 30, 40, 50 };
        // int multi = myFifthArray[0] * 2;
        // System.out.print(myFifthArray[0]);
        // System.out.println(multi);

        for (int i = 0; i < myFifthArray.length; i++) {
            System.out.println(myFifthArray[i] + "\t" + myFifthArray[i] * 2);
        }

    }
}
