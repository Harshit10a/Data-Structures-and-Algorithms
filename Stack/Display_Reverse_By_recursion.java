import java.util.Stack;

public class Display_Reverse_By_recursion {
    public static void displayrecrev(Stack<Integer> s){
        if(s.size()==0) return;
        int top=s.pop();
        System.out.print(top+ " ");
        displayrecrev(s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayrecrev(st);
    }
}
