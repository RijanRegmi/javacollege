import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {
        /* Import ArrayList from java.util */
        ArrayList<String> names = new ArrayList<>();

        names.add("Rijan");
        names.add("Aadhar");
        names.add("Subham");
        names.add("Niraj");
        names.add("Aayam");
        names.add("Aayush");

        /* To loop, find the length/element count, .size() */
        int namesLength = names.size();
        /* Loop same as array */
        for (int i = 0; i < namesLength; i++) {
            // Get each element with .get(index)
            String singleName = names.get(i);
            System.out.println("Index: " + i + " Value: " + singleName);
        }

        /* Use foreach in java, interate with element/actual value */
        for (String element : names) {
            System.out.println(element);
        }

        /* Task 2 */
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Dog");
        animals.add("Elephent");

        ArrayList<String> wildAnimal = new ArrayList<>();
        ArrayList<String> domesticAnimals = new ArrayList<>();

        int animalsLength = animals.size();

        for (int i = 0; i < animalsLength; i++) {
            if (animals.get(i) == "Cat" || animals.get(i) == "Dog") {
                domesticAnimals.add(animals.get(i));
            } else {
                wildAnimal.add(animals.get(i));
            }
        }
        System.out.println("The domestic animals are: " + domesticAnimals);
        System.out.println("The wild animals are: " + wildAnimal);

        for (String elem : animals) {
            if (elem == "Cat" || elem == "Dog") {
                domesticAnimals.add(elem);
            } else {
                wildAnimal.add(elem);
            }
        }
        System.out.println(domesticAnimals);
        System.out.println(wildAnimal);

    }

}
