import java.util.Stack;

public class Duplicate_Parenthese {
    public static boolean duplicate(String s ){
        Stack<Character> st =new Stack<>() ;
        for (int i = 0; i < s.length() ; i++) {
            char ch =s.charAt(i);
            if(ch == ')')
            {
            int count=0;
            while(st.peek() != '('){
                st.pop();
                count++;
            }
            if(count<1) return true;
            else st.pop();
            }
            else st.push(ch);
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="((a+b))";
        String str2="(a+b)";
        System.out.println(duplicate(str2));
    }
}
