public class MultiDimArray {
    public static void main(String[] args) {
        // create N-dimensional array
        // 1D array
        int[][] oneDArray;
        // 2D Array
        int[][] twoDarray;
        // 3D array
        int[][][] threeDArray;

        // Allocating memory/size
        twoDarray = new int[3][5];
        // First size three represent how many inner arrray
        // second size 5 represent how many value in inner array
        /*
         * [
         * [10,0,0,0,0]
         * [0,0,0,0,0]
         * [0,0,0,0,0]
         * ]
         */
        // To take the first inner array use index
        // twoDarray[0];
        // To take the value in inner arrayb use internal index
        twoDarray[0][0] = 10;
        twoDarray[0][1] = 20;
        twoDarray[2][4] = 200;

        // Fill the array like the following
        // [
        // [10,20,30,40,50]
        // [80,90,100,110,120]
        // [150,160,170,180,200]

        // ]

        int[][] newArray = new int[3][5];
        newArray[0][0] = 10;
        newArray[0][1] = 10;
        newArray[0][2] = 10;
        newArray[0][3] = 10;
        newArray[0][4] = 10;
        newArray[1][0] = 10;
        newArray[1][1] = 10;
        newArray[1][2] = 10;
        newArray[1][3] = 10;
        newArray[1][4] = 10;
        newArray[2][0] = 10;
        newArray[2][1] = 10;
        newArray[2][2] = 10;
        newArray[2][3] = 10;
        newArray[2][4] = 10;

        // Now print the 1st index array like
        // Array in 1st index
        // 80
        // 90
        // 100
        // 110
        // 120
        // Note: without using loop
        System.out.println("Array in 1st index");
        System.out.println(newArray[1][0]);
        System.out.println(newArray[1][1]);
        System.out.println(newArray[1][2]);
        System.out.println(newArray[1][3]);
        System.out.println(newArray[1][4]);

        // Multi Dim array memory alloc and assignment
        // int[][] array = {
        // {10,20,30},
        // {20,30,40},
        // {100,200,300},
        // {3,4,5}
        // }
        // [4][3]

    }
}