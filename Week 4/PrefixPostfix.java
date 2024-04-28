
public class PrefixPostfix {
    public static void main(String[] args) {
        int prefixvalue = 10;
        /* Note that the value change in same line */
        System.out.println(++prefixvalue);
        System.out.println(prefixvalue);
        int postFix = 20;
        /* Note that the value doesnot change in same line */
        System.out.println(postFix++);
        System.out.println(postFix);

    }

}
