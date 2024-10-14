import java.util.Stack;

public class Reverse_A_String {
    public static void main(String[] args) {
        Stack<String> st =new Stack<>();
        StringBuilder sb =new StringBuilder("");
        st.push("a");
        st.push("b");
        st.push("c");
        st.push("d");
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        System.out.println(sb);
    }
}
