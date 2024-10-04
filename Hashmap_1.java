//7. HashMap Program
//Create a HashMap with 3 product names as keys and their prices as values. Update the price of one product and display the updated map
import java.util.HashMap;
class Hashmap_1
{
    public static void main(String[] args) {
        HashMap <String,Integer> hm = new HashMap<>();
        hm.put("Computer", 20000);
        hm.put("Laptop", 25000);
        hm.put("Monitor", 10000);
        System.out.println(hm);
        hm.put("Monitor", 8000);
        System.out.println(hm);
    
        System.out.println(hm.get("Laptop"));
        System.out.println(hm.containsKey("Monitor"));
        hm.forEach((k,v)->{System.out.println(k+" " +v);});

    }

}