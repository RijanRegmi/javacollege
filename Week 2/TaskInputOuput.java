import java.util.Scanner;

public class TaskInputOuput {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scan1.nextLine();
        System.out.println("Are you over 18 ");
        boolean age = scan1.nextBoolean();
        System.out.println("How many sibling? ");
        int sibling = scan1.nextInt();
        System.out.println("Hello " + name);
        System.out.println("Over 18? " + age);
        System.out.println("You Have " + sibling + " sibling");
        scan1.close();
    }
}
