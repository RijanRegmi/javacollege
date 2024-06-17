public class AbstractClass {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        samsung.call();
        samsung.message();
        System.out.println(samsung.text("Hey"));

        Samsung apple = new Samsung();
        apple.call();
        apple.message();
        System.out.println(apple.text("Hello"));
    }
}

// to make abstract class, use abstract keyboard before "class"
// if a class is abstract, it cannot be make object of
abstract class SmartPhone {
    // abstract function do not have body
    // abstract class may or may not contain abstract function
    // if there is at least one abstract function, class have to be abstarct
    abstract public void call();

    abstract public void message();

    abstract public boolean text(String text);
}

class Samsung extends SmartPhone {
    @Override
    public void call() {
        System.out.println("Samsung calling");
    }

    @Override
    public void message() {
        System.out.println("Samsung message");
    }

    @Override
    public boolean text(String text) {
        return true;
    }
}

class Apple extends SmartPhone {
    @Override
    public void call() {
        System.out.println("Apple calling");
    }

    @Override
    public void message() {
        System.out.println("Apple message");
    }

    @Override
    public boolean text(String text) {
        return true;
    }
}