public class ArrayLoop {
    public static void main(String[] args) {
        int[] data = { 10, 20, 30, 40, 50 };
        int arrayLength = data.length;
        /* First approach */
        for (int i = 0; i < arrayLength; i++)
            ;
        /* Second approach */
        for (int i = 0; i <= arrayLength - 1; i++) {
            System.out.println("Index " + i + " Value " + data[i]);
        }

        // data[100]; this will crash, no index accessible
        /* task */

        int[] array1 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = -(array1[i]);
            System.out.println(array1[i] + "\t" + array2[i]);
        }

        /* Task 2 */
        int ar = array2.length;
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.println(array2[i]);
        }
    }

}
