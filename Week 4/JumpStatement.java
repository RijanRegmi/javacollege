public class JumpStatement {
    public static void main(String[] args) {
        /* Break and continue are jump statement in java */
        /* Break will terminate the loop */
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break; // this line will break the loop scope
            }
            System.out.println("Index " + i);
        }
        /* can be used in any loop */
        int count = 0;
        while (count <= 10) {
            if (count == 1) {
                break;
            }
            System.out.println("Count " + count);
            count++;
        }
        /* continue statement will skip the loop */
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("continue index " + i);
        }

        for (int i = -5; i < 5; i++) {
            if (i == 0) {
                break;
            }
            System.out.println("Count: " + i);
        }

        for (int i = 1; i < 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("count " + i);
        }

    }

}
