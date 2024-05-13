public class MultiDimArrayLoop {

    public static void main(String[] args) {
        /* Create an array with [4][2] */
        int[][] arr = new int[4][2];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = -10;
        arr[1][1] = -20;
        arr[2][0] = 100;
        arr[2][1] = 200;
        arr[3][0] = -100;
        arr[3][1] = -200;

        /*
         * Visual representation
         * [
         * [10,20]
         * [-10,-20]
         * [100,200]
         * [-100,-200]
         * ]
         */
        /* Loop outer array */
        int outerLength = arr.length; // ->4
        for (int j = 0; j < outerLength; j++) {
            System.out.println("Array in index " + j);
            // System.out.println(arr[j][0]);
            // System.out.println(arr[j][1]);
            int innerArratLength = arr[j].length;
            for (int i = 0; i < innerArratLength; i++) {
                System.out.println(arr[j][i]); // inner loops from 0,1

            }
        }

        String[][] name = { { "Helan", "Niraj", "Subham" }, { "Rijan", "Ram", "Vardae" } };

        name[0][0] = "Helan";
        name[0][1] = "Niraj";
        name[0][2] = "Subham";
        name[1][0] = "Rijan";
        name[1][1] = "Ram";
        name[1][2] = "Vardae";

        for (int i = 0; i < name.length; i++) {
            System.out.println();
            for (int j = 0; j < name[i].length; j++) {
                // System.out.print(name[i][j] + "\t\t ");
                if (name[i][j] == "Ram") {
                    System.out.println("Ram is in " + i + " " + j + " Array");
                }
            }
        }

    }
}
