public class InheritanceClass {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.lastname = "Test";
        cc.firstname = "ABC";
        cc.info();
        cc.greet();
        GrandChaild gc = new GrandChaild();
        gc.firstname = "John";
        gc.middlename = "Foo";
        gc.lastname = "Doe";
        gc.info();
        gc.call();

    }
}

class ParentClass {
    String lastname;
    private int salary;
    protected String address;

    void info() {
        System.out.println("last Name " + lastname);
    }
}

// extedns keywords used to create child class
class ChildClass extends ParentClass {
    String firstname;

    void greet() {
        System.out.println("First Name: " + firstname + " Last Name: " + lastname);
    }
}

// multi lavel
class GrandChaild extends ChildClass {
    String middlename;

    void call() {
        System.out.println(firstname + " " + middlename + " " + lastname);
    }
}

// Tree
class UncleClass extends ParentClass {
    String job;

    void detail() {
        System.out.println(job + " " + lastname);
    }

}
