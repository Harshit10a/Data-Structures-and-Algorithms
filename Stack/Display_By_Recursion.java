import java.util.Stack;

public class Display_By_Recursion {
    public static void displaynormal(Stack<Integer> rt){
        if(rt.size()==0) return;
        int top=rt.pop();
        displaynormal(rt);
        System.out.print(top+" ");
        rt.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displaynormal(st);
    }
}
