import java.util.ArrayList;
import java.util.Stack;

public class MainTest {
    public static void main(String[] args) {
        int[] i = new int[5];

        System.out.println("\n\nDynamicArray add & print");
        DataCollection<City> arr = new DynamicArray<>();
        arr.put(new City("Seoul", "Korea")); // put 8~10 elements
        arr.forEach(System.out::println); // test Iterable<E>
        // remove & insert & elemAt & clear & remove all using iterator &
        // print using for/while/foreach
        ArrayList<City> list = new ArrayList<>();
        list.add(new City("Seoul", "Korea")); // add 8~10 elements
        DataCollection<City> arr2 = new ListDataCollection<>(list);
        arr2.put(new City("Chicago", "USA")); // put 2~3 elements
        arr2.forEach(System.out::println);
        // remove & insert & elemAt & clear & remove all using iterator &
        // print using for/while/foreach
        Stack<City> stack = new Stack<>();
        stack.push(new City("Seoul","Korea")); // push 8~10 elements
        DataCollection<City> arr3 = new ListDataCollection<>(stack);
        arr3.insert(0, new City("New York", "USA")); // insert 2~3 elements
        arr3.forEach(System.out::println);
        // remove & insert & elemAt & clear & remove all using iterator &
        // print using for/while/foreach
    }
}
