import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Print_Elements_of_Queue {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        Queue<Integer> helper = new ArrayDeque<>();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        qu.add(6);
        while(qu.size()>0){
            System.out.println(qu.peek());
            helper.add(qu.remove());
        }
        while(helper.size()>0){
            qu.add(helper.remove());
        }
    }
}
