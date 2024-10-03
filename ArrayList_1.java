import java.util.ArrayList;

public class ArrayList_1 {

    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(1);
        System.out.println("Before:");
        for(int i : list1)
        {
            System.out.println(i + " ");
        }
        
        list1.removeIf(n -> n %2 != 0);
        
        System.out.println("After:");
        for(int i : list1)
        {
            System.out.println(i);
        }
        
    }
    
}
