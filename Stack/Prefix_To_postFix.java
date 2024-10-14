import java.util.Stack;

public class Prefix_To_postFix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> value = new Stack<>();
        for (int i = str.length()-1;i>=0;i--) {
            char ch = str.charAt(i);
            int eski = (int) ch;
            if (eski >= 48 && eski <= 57) {
                value.push(ch+"");
            } else {
                String v1 = value.pop();
                String  v2 = value.pop();
                char op = ch;
                String t = v1 + v2 +op;
                value.push(t);
            }
        }
        System.out.println(value.peek());
    }
}
