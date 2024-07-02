import javax.print.attribute.DocAttribute;

public class Polymorphism {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(10, 20));
        System.out.println(mo.add(1, 2, 3));
        mo.add();

        // Method Overrding
        // Polymorphism allow Parent class to hold child object
        Document d1 = new Document();
        d1.print("Dell XPS");
        Document d2 = new MsWord();
        d2.print("Xeroz");
        // when doing so, though we are creating from ChildClass MsWord() we are
        // creating only function/attribute from Document
        Document d3 = new Office365();
        d3.print("Xeroz");
        // cannot access d3.internet

        Spreadsheet sp = new Spreadsheet();
        sp.addRow(5);
        sp.addColumn(3);

        Spreadsheet msExcel = new MsExcel();
        msExcel.addRow(7);
        msExcel.addColumn(4);

        System.out.println(mo.subtraction(10, 5));
        System.out.println(mo.subtraction(1.1, 2.2, 3.3));
        mo.subtraction(3.5);
        mo.subtraction(7);
        System.out.println(mo.subtraction(10, 20, 2.5));
    }
}

// method Overloading
// same dunction with difference in parameter
class MathOperation {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    // 1. Method overloading with changing in data type
    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // 2. Method overloading with change in data type
    double add(double num1, double num2) {
        return num1 + num2;
    }

    // Note: the change in return typr doesnot determine overloading
    // method overloading only determine with change in parameter
    // Also, changing the varaible name is also not allowed
    // Eg: int add(int a, int b) -> not allowed
    // as function with 2 int is already made
    void add() {
        System.out.println("Invalid Operation");
    }

    int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    double subtraction(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    void subtraction(double num1) {
        System.out.println("Invalid Operation");
    }

    void subtraction(int num1) {
        System.out.println("Invalid Operation");
    }

    double subtraction(int num1, int num2, double num3) {
        return num1 - num2 - num3;
    }
}

// method overloading
// when Childclass has same function as parent class
class Document {
    public void print(String printer) {
        System.out.println("Document Printing");
    }
}

class MsWord extends Document {
    boolean internet = true;

    // Overriding can be done in multi layer inheritance
    @Override
    public void print(String printer) {
        System.out.println("Ms word prints");
    }
}

class Office365 extends MsWord {
    boolean internet = true;

    // Overriding can be done in multi layer inheritance
    @Override
    public void print(String printer) {
        System.out.println("Online printer");
    }
}

// Homework

// Make a class Spreadsheet
// Make a function addRow that takes one int -> print( int row added)
// Make a function addColumn that takes one int -> print( int coloumn added)
// Make a subclass from Spreadsheet, MsExcel
// override both the function and print different output
// make attribute fileType as String
// Make an object of Spreadsheet
// Make an Object of Spreadsheet as MsExcel
// run both function from each object

// Task
// Make a function substraction
// take two int and return int
// take three double and return double
// take 1 double and print invalid operation
// take 1 int and print invalid operation
// take 2 int and double and return double
// call these function from MathOperation object

class Spreadsheet {
    public void addRow(int rows) {
        System.out.println(rows + " row added");
    }

    public void addColumn(int columns) {
        System.out.println(columns + " column added");
    }
}

class MsExcel extends Spreadsheet {
    String fileType = "Excel";

    @Override
    public void addRow(int rows) {
        System.out.println(rows + " rows added in Excel");
    }

    @Override
    public void addColumn(int columns) {
        System.out.println(columns + " columns added in Excel");
    }
}