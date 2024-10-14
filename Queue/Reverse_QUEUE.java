import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Reverse_QUEUE {
    public static void main(String[] args) {
        Stack st = new Stack<Integer>();
        Queue kyu = new ArrayDeque();
        kyu.add(1);
        kyu.add(2);
        kyu.add(3);
        kyu.add(4);
        kyu.add(5);
        kyu.add(6);
        while(kyu.size()!=0){
            st.push(kyu.remove());
        }
       while(st.size()!=0){
          kyu.add(st.pop());
       }
        System.out.println(kyu);
    }
}
