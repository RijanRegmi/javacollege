public class FirstOop {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Rijan";
        person1.age = 20;
        person1.gender = 'M';
        System.out.println(person1.name);
        person1.inttroduction();

        /* Task */
        Person person2 = new Person();
        person2.name = "Niraj";
        person2.age = 19;
        person2.gender = 'F';
        person2.inttroduction();

        Rectangle rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.breadth = 90;
        int areaRectangle = rectangle.areaOfRectangle();
        System.out.println("Area of Rectangle is " + areaRectangle);

        car car = new car();
        car.carName = "Toyota";
        car.color = "Black";
        car.year = 1990;

        car.start();
        car.stop();

        System.out.println(car.exping());

        Student student = new Student();
        student.firstName = "Rijan";
        student.lastName = "Regmi";
        student.studentId = 230488;
        student.age = 20;

        student.fullName();
        // System.out.println("Full name is" + studentname);
        student.description();
        student.overEighteen();
    }
}

class Rectangle {
    int length;
    int breadth;

    int areaOfRectangle() {
        int area = length * breadth;
        return area;
    }
}

class Person {
    String name;
    int age;
    char gender;

    void inttroduction() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class car {
    String carName;
    String color;
    int year;

    void start() {
        System.out.println(carName + " is started");
    }

    void stop() {
        System.out.println(carName + " of color " + color + " is stoping");
    }

    int exping() {
        int added = year + 100;
        return added;
    }
}

/* Task 2 */
class Student {
    String firstName;
    String lastName;
    int studentId;
    int age;

    String fullName() {
        return firstName + " " + lastName;
    }

    void description() {
        System.out.println(fullName() + " " + studentId);
    }

    boolean overEighteen() {
        return age > 18;
    }

}
