import java.util.Stack;

public class Balanced_Bracket {
    public static boolean isBalanced(String s){
        Stack<Character> st =new Stack<>();
        int n=s.length();
        for (int i = 0; i <n ; i++) {
            char ch = s.charAt(i);
            if(ch=='('||ch=='['||ch=='{' ){
                st.push(ch);
            }else {
                if(st.size()==0)return false;
                if( st.peek()=='('&& ch=='(' || st.peek()=='['&& ch==']' ||st.peek()=='{'&& ch=='}') st.pop();
            }
        }
        if(st.size()>0)return false;
        return true;

    }
    public static void main(String[] args) {
        String str ="()()(())";
        System.out.println(isBalanced(str));
    }
}
