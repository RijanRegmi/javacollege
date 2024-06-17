public class Task {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
    }
}

abstract class Shape {
    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    double length = 10;
    double breadth = 20;

    @Override
    double calculateArea() {
        double area = length * breadth;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        return perimeter;
    }
}

class Circle extends Shape {
    double radius = 2.3;

    @Override
    double calculateArea() {
        double area = 3.14 * radius * radius;
        return area;
    }

    @Override
    double calculatePerimeter() {

        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }
}
