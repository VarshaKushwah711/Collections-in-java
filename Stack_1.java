//9. Stack Program
//Create a Stack of 5 numbers. Pop all the elements one by one and print each element as it is removed.
import java.util.Stack;
import java.util.Collections;
public class Stack_1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(50);
        st.push(40);
        st.push(30);
        st.push(20);
        st.push(10);
        System.err.println(st);
        System.out.println("Position of 50: " + st.search(50)); 
        Collections.sort(st);
        System.out.println("Shorted stack : " + st);
        st.pop();
        System.out.println(st);
        while(!st.isEmpty())
        {
            st.pop();
        }
        System.out.println(st);


    }
    
}
