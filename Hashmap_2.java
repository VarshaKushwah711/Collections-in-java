//8. HashMap Program
//Create a HashMap to store 4 students' names as keys and their marks as values. Calculate the average marks and print it.
import java.util.HashMap;
public class Hashmap_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("varsha",98);
        hm.put("mansi",98);
        hm.put("saloni", 87);
        hm.put("neha",78);
        int sum = 0;
        for(int i : hm.values())
        {
            sum += i;
        }
        double avg = sum/hm.size();
        System.out.println(avg);
        
    }
}
