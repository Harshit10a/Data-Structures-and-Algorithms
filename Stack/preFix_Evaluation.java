import java.util.Stack;

public class preFix_Evaluation {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> value = new Stack<>();
        for (int i = str.length()-1;i>=0;i--) {
            char ch = str.charAt(i);
            int eski = (int) ch;
            if (eski >= 48 && eski <= 57) {
                value.push(eski - 48);
            } else {
                int v1 = value.pop();
                int v2 = value.pop();
                if (ch == '+') value.push(v1 + v2);
                if (ch == '-') value.push(v1 - v2);
                if (ch == '*') value.push(v1 * v2);
                if (ch == '/') value.push(v1 / v2);
            }
        }
        System.out.println(value.peek());
    }
}
