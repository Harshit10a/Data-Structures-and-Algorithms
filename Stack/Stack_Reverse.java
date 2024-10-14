import java.util.Stack;

public class Stack_Reverse {

    public static void reverse (Stack<Integer> s){
        if(s.isEmpty()) return;
        int top=s.pop();
        reverse(s);
        pushAtBottom(s,top);
    }
    public static  void pushAtBottom(Stack<Integer> s , int val) {
            if (s.isEmpty()) {
                s.push(val);
                return;
            }
            int top = s.pop();
            pushAtBottom(s, val);
            s.push(top);
        }
            public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
                System.out.println("Before Reverse ");
                System.out.println(st);
                reverse(st);
                System.out.println("After Reverse ");
                System.out.println(st);

    }
}
