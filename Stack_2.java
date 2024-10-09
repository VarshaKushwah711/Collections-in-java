//10. Stack Program
//Create a Stack of strings. Push 3 strings onto the stack and then search for a specific string to find its position in the stack.
import java.util.Stack;
public class Stack_2 {
    public static void main(String[] args) {
        Stack <String> st = new Stack<>();
        st.push("varsha");
        st.push("mansi");
        st.push("slaoni");
        System.out.println(st);
        System.err.println("varsha postions: " + st.search("varsha"));

        String l = st.peek();
        System.out.println(l);
        System.out.println(st);
        System.out.println(st.isEmpty());

    }
    
}
