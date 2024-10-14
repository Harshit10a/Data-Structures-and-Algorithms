import java.util.Stack;

public class Infix_TO_Prefix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> value = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57){
                String s = "" +ch;
                value.push(s);
            }
            else if (operator.size() == 0 || ch == '(' || operator.peek() == '(') operator.push(ch);
            else if (ch == ')') {
                while (operator.peek() != '(') {
                    String v2 = value.pop();
                    String v1 = value.pop();
                     char oper = operator.pop();
                     String st =oper +v1 +v2;
                     value.push(st);
                }
                operator.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    String v2 = value.pop();
                    String v1 = value.pop();
                    char oper = operator.pop();
                    String st =oper +v1 +v2;
                    value.push(st);
                    operator.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (operator.peek() == '*' || operator.peek() == '/') {
                        String v2 = value.pop();
                        String v1 = value.pop();
                        char oper = operator.pop();
                        String st =oper +v1 +v2;
                        value.push(st);
                        operator.push(ch);
                    } else operator.push(ch);
                }
            }
        }
        while (value.size() > 1) {
            String v2 = value.pop();
            String v1 = value.pop();
            char oper = operator.pop();
            String st =oper +v1 +v2;
            value.push(st);

        }
        System.out.println(value.peek());
    }
}
