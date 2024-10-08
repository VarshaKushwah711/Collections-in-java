//4. LinkedList Program
//Create a LinkedList of 5 integers. Calculate and print the sum of all the elements.
import java.util.LinkedList;
public class Linkedlist_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(23);
        int sum=0;
        for(int i : list)
        {
            sum += i;
        }
        System.out.println("sum of all the elements: " + sum);

        
    }
}
