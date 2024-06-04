public class AccessModifier {
    public static void main(String[] args) {
        AcessExample ae1 = new AcessExample();
        // ae1.intValue = 100;
        ae1.strValue = "Test";
        ae1.boolVal = true;
        // ae1.doPrivate();
        ae1.setPrivate();
    }
}

class ThisExample {
    private int lenght;// "this.lenghth" in this class represent this lenght;
    private int breath;

    void fillData(int lenght) {
        this.lenght = lenght;// this represent current class attribut
        this.breath = breath;// thebreathe without this represent the args/paramenter of function
    }
}

class AcessExample {
    private int intValue;// can only inside class scope
    public String strValue;// can be used anywhere
    boolean boolVal;

    // similarly can be used in function
    private void doPrivate() {
        System.out.println("I can be accessed only in this class");

    }

    public void doPublic() {
        System.out.println("I can be accessed from current package/folder");
    }

    // private can be used in class
    void setPrivate() {
        intValue = 100;// private can be accessed here
        doPrivate();// same goes to private functions
    }
}

class task1 {
    // create a priavte variable for name, age
    // create public for address
    // make a function to fill data for Name and Age
    // Make a fucntion to print Name age and address

    private String Name;
    private int age;
    public String address;

    public void fill1data(String Name, int age, String address) {
        this.Name = Name;
        this.age = age;
        this.address = address;

    }

    void data() {
        System.out.println("name:" + this.Name + "age:" + this.age + "address" + this.address);

    }
}