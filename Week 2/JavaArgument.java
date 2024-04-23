public class JavaArgument {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Not engugh args");
            return;
        }
        System.out.println("First arg is " + args[0]);
        System.out.println("Second arg is " + args[1]);
        // convert string into integer/ must pass number in 2nd args
        int argInt = Integer.parseInt(args[1]);
    }

}
