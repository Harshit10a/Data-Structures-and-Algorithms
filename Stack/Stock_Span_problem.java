import java.util.Arrays;
import java.util.Stack;

public class Stock_Span_problem {
    public static void main(String[] args) {
        int price[] = {100, 80 ,60, 70, 60, 75 ,85};
        int n= price.length;
        int result[] = new int[n];
        Stack<Integer> st =new Stack<>();
        for (int i = 0; i <n ; i++) {
            int curr = price[i];
            if (st.isEmpty()) result[i] = i + 1;

            while (st.size() > 0 && curr > price[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) result[i] = i + 1;
            else {
                int prevhigh = st.peek();
                result[i] = i - prevhigh;

            }
            st.push(i);
        }
        System.out.println(Arrays.toString(result));

        }

    }

