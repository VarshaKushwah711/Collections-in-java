//3. LinkedList Program
//Create a LinkedList of 4 countries, add one country to the beginning and one at the end, then print the list in reverse order.
import java.util.Collections;
import java.util.LinkedList;
public class Linkedlist_1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("japan");
        list.add("tokyo");
        list.add("america");
        list.add("china");
        System.out.print("Before:");
        System.out.println(list);

        list.addFirst("india");
        list.addLast("Bhutan");

        System.out.print("After:");
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

    }
    
}
