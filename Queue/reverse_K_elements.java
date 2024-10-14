import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverse_K_elements {
    public static void main(String[] args) {
        int k=3;
        Queue <Integer>  q = new ArrayDeque();
        Stack<Integer>  st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        for (int i = 0; i <k; i++) {
            st.push(q.remove());
        }
       while(st.size()!=0){
           q.add(st.pop());
       }
        for (int i = 0; i <=k ; i++) {
            q.remove();
        }


    }
}
