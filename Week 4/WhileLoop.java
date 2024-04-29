public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        /*
         * While takes boolean express instade ()
         * The loop will run repeatively when the boolean is true
         * If the boolean is false the loop will end
         */
        while (count < 5) {
            System.out.println("While loop" + count);
            ++count;
        }
        /*
         * In while loop the condition is checked at the begaining
         * if the condition is false in inital check ythe loop will not run
         */
    }

}
