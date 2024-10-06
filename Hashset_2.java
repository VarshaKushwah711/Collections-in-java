//6. HashSet Program
//Create a HashSet of names. Add 5 names, then convert this HashSet into an ArrayList and print the resulting list.
import java.util.ArrayList;
import java.util.HashSet;
public class Hashset_2 {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Cherry");
        list.add("Papaya");
        System.out.println("HashSet: " + list);

        ArrayList<String> Alist = new ArrayList<>(list);
        System.out.println("ArrayList: " + Alist);


    }
    
}
