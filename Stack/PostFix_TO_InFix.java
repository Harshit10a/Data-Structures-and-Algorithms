import java.util.Stack;

public class PostFix_TO_InFix {
    public static void main(String[] args) {
       String str ="953+4*6/-";
        Stack<String > value = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int eski = (int) ch;
            if (eski >= 48 && eski <= 57) {
                value.push(ch+"");
            } else {
                String v2 = value.pop();
                String v1 = value.pop();
              char op= ch;
              String t = v1 + op +v2;
              value.push(t);
            }
        }
        System.out.println(value.peek());
    }
}
