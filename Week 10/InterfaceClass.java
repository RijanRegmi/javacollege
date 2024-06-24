public class InterfaceClass {
    public static void main(String[] args) {
        
    }
}

// make interface similar to class with "interFace" keyboard
// interface is automatically abstract
interface AnimalInterface{
    // function inside the interface is automatically abstract
    // function hidden or on body
    public void eat();
    public void sleep();
}
interface MammalIntercae extends AnimalInterface{
    public int legs();
}
interface DogInterface extends MammalIntercae{
    public String barks();
}
interface DomesticInterface{
    public void pet();
}

class Husky implements DogInterface, DomesticInterface{
    @Override
    public void pet(){
        System.out.println("Husky likes pet");
    }
    @Override
    public void eat(){
        System.out.println("Husky eats fish");
    }
    @Override
    public void sleep(){
        System.out.println("Jusky sleeps at dusk");
    }
    @Override
    public int legs(){
        return 4;
    }
    @Override
    public String barks(){
        return "Woof woof";
    }
}

// to use interface use "implements" keyword
class Bulldog implements AnimalInterface{
    // using interface, we need to override/make body of all the function of interface
    @Override
    public void eat(){
        System.out.println("Bulldoge eats meat");
    }
    @Override
    public void sleep(){
        System.out.println("Bulldog sleeps at night");
    }
}

class Cow implements AnimalInterface{
    @Override
    public void eat(){
        System.out.println("Cow eats grass");
    }
    @Override
    public void sleep(){
        System.out.println("Cow sleeps at morning");
    }
}

