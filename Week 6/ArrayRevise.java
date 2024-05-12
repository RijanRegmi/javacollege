public class ArrayRevise {

    public static int ArrayFinder(String[] arr, String find) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                return i;
            }
        }
        return -1;
    }

    /* Task 2 */
    public static int[] addToArray(int[] arr1, int value) {
        int[] newArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i] + value;
        }
        return newArray;
    }

    /*
     * Make a function reverseArray
     * take array of int
     * return new array of reversed index
     * Eg [1,2,3,4]
     * returns [4,3,2,1]
     */

    public static void main(String[] args) {
        /* 3 ways to create array */
        int[] arrayOne;
        arrayOne = new int[2]; // -> [0,0]
        int[] arraySecond = new int[2]; // -> [0,0]
        int[] arrayTwo = { 1, 2, 3, 4, 10 }; // -> [1,2,3,4,5,10]

        System.out.println(arrayTwo[3]);
        arrayTwo[1] = 200;

        /* Looping an array */
        int arrayTwoLength = arrayTwo.length;
        for (int i = 0; i < arrayTwoLength; i++) {
            System.out.println("Index: " + i + " value: " + arrayTwo[i]);
        }
        /* Or loop from 0 <= arrayTwoLength - 1 */

        String[] name = { "Rijan", "Ram", "John", "Shyam" };
        String finder1 = "Rijan";

        /* Loop name and find the index of shyam */
        for (int i = 0; i < name.length; i++) {
            if (name[i] == finder1) {
                System.out.println("Index Found " + i);
            }
        }

        int[] arr1 = { 1, 2, 3, 4 };

    }

}
