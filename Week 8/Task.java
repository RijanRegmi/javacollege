public class Task {
    public static void main(String[] args) {
        
    }
}

class AnimalClass{
    int lifespan;
    void speaks(){
        System.out.println("Life Span "+lifespan);
    }
}

class mammalClass extends AnimalClass{
    int legs;
    void fur(){
        System.out.println("furry"+legs);
    }
}

class dog extends mammalClass{
    String diet;
    void barks(){
        System.out.println("barks"+diet);
    }
}

class germanshepard extends dog{
}
class labrador extends dog{
}

class reptile extends AnimalClass{
    int eggs;
    void shed(){
        System.out.println("Shedding "+eggs);
    }
}
