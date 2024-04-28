public class ForLoop {
    public static void main(String[] args) {
        /* USe for loop when condition is fixed */
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop running " + i);
        }

        /* Decremen loop */
        for (int i = 10; i >= 0; i--) {
            System.out.println("Loop running " + i);
        }
        /* Make the loop table for this */

        /* task */
        /* table of 2 */
        for (int i = 1; i < 11; i++) {
            System.out.println("2 x " + i + "=" + i * 2);
        }

        /* Nested Loop */
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 2; inner >= 0; inner--) {
                System.out.println("Inner" + inner);
            }
            System.out.println("Outer " + outer);
        }

        /*
         * Task use nested loop to do the following
         * make multiplication table from 1 - 10
         * eg:
         * 1 x 1 = 1
         * 1 x 2 =2
         * .
         * 1 x 10 = 10
         * .
         * .
         * 10 x 1 = 10
         * 10 x 2 = 20
         * .
         * 10 x 2 =100
         */

        for (int j = 1; j < 11; j++) {
            System.out.println("Multiplication table of " + j);
            for (int i = 1; i < 11; i++) {
                System.out.println(j + " x " + i + " = " + i * j);
            }
            System.out.print("\n");
        }

    }

}
