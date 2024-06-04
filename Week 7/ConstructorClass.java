public class ConstructorClass {
    public static void main(String[] args) {
        ConExample conl = new ConExample();
        System.out.println("After object creation");
        ParemeterizedConstructor pcl = new ParemeterizedConstructor(10);
        System.out.println("From object: " + pcl.lenght);
    }
}

class ConExample {
    ConExample() {
        System.out.println("This is non parameterized constructor");
    }
}

class ParemeterizedConstructor {
    int lenght;

    ParemeterizedConstructor(int length) {
        this.lenght = length;
        System.out.println(this.lenght);
    }
}

class FruitBasket {

}
