import java.util.Stack;

public class Push_At_Bottom_BY_RECURSION {
    public static  void pushAtBottom(Stack<Integer> s , int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int top= s.pop();
        pushAtBottom(s,val);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        pushAtBottom(st, 5);
        System.out.println(st);

    }
}
