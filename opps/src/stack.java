import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> st=new Stack();
       // st.isEmpty();
        st.push("d");
        st.push("a");
        st.push("a");
        st.push("d");
        st.push("a");
        st.push("a");
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.size());

    }
}
