import java.util.Stack;

public class Infix_Expression {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Integer> value = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) value.push(ascii - 48);
            else if (operator.size() == 0 || ch == '(' || operator.peek() == '(') operator.push(ch);
            else if (ch == ')') {
                while (operator.peek() != '(') {
                    int v2 = value.pop();
                    int v1 = value.pop();
                    if (operator.peek() == '+') value.push(v1 + v2);
                    if (operator.peek() == '-') value.push(v1 - v2);
                    if (operator.peek() == '*') value.push(v1 * v2);
                    if (operator.peek() == '/') value.push(v1 / v2);
                    operator.pop();
                }
                operator.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    int v2 = value.pop();
                    int v1 = value.pop();
                    if (operator.peek() == '+') value.push(v1 + v2);
                    if (operator.peek() == '-') value.push(v1 - v2);
                    if (operator.peek() == '*') value.push(v1 * v2);
                    if (operator.peek() == '/') value.push(v1 / v2);
                    operator.pop();
                    operator.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (operator.peek() == '*' || operator.peek() == '/') {
                        int v2 = value.pop();
                        int v1 = value.pop();
                        if (operator.peek() == '*') value.push(v1 * v2);
                        if (operator.peek() == '/') value.push(v1 / v2);
                        operator.pop();
                        operator.push(ch);
                    } else operator.push(ch);
                }


            }


        }
        while (value.size() > 1) {
            int v2 = value.pop();
            int v1 = value.pop();
            if (operator.peek() == '+') value.push(v1 + v2);
            if (operator.peek() == '-') value.push(v1 - v2);
            if (operator.peek() == '*') value.push(v1 * v2);
            if (operator.peek() == '/') value.push(v1 / v2);
            operator.pop();
        }
        System.out.println(value.peek());
    }
}
