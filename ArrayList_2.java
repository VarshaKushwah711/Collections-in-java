import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_2{

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("indore");
        list.add("Bhopal");
        list.add("mumbai");
        list.add("ujjain");
        list.add("Ratlam");
        for(String i : list)
        {
            System.out.println(i);
        }
        System.out.println();
        Collections.sort(list);
        for(String i : list)
        {
            System.out.println(i);
        }

        
    }
    
}
