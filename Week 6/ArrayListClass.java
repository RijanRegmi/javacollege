import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {
        /* To use ArrayList import at the top like Scanner from java.utils */
        ArrayList<String> animals = new ArrayList<>();
        /* Size is automaatacally alloceted according to element */
        /* To add data in anilaams */
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephent");
        System.out.println(animals);
        /* Can add element directly to index, it will shift rest to + 1 of index */
        animals.add(1, "Tiger");
        System.out.println(animals);
        /* Notice how the previous 1 and rest are shifted by 1 index */

        /* To remove use .remove(index) */
        animals.remove(2);
        System.out.println(animals);
        /* It will remove the item/element in 2nd index */

        // to update .set(index, value)
        animals.set(1, "Snake");
        System.out.println(animals);
        // to access cannot use [index] -> square bracket, use .get(index)
        System.out.println(animals.get(0)); // get 0th indexed element

        /* Task */
        ArrayList<Integer> task1 = new ArrayList<>();

        task1.add(100);
        task1.add(200);
        task1.add(300);
        task1.add(400);
        task1.add(500);

        task1.add(0, -100);
        task1.remove(3);
        task1.set(2, 210);
        task1.set(3, 420);
        System.out.println(task1);

    }

}
