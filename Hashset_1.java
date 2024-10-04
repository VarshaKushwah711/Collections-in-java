//5. HashSet Program
//Create a HashSet of 5 numbers. Check if a specific number exists and print whether it’s found or not.//

import java.util.HashSet;
public class Hashset_1 {

    public static void main(String[] args) {
        HashSet<Integer> HS = new HashSet<>();
        HS.add(50);
        HS.add(40);
        HS.add(30);
        HS.add(20);
        System.out.println(HS);
        if(HS.contains(30))
        {
            System.out.println("is Exist");
        }
        else{
            System.out.println("not Exist");
        }
        

    }
    
}
