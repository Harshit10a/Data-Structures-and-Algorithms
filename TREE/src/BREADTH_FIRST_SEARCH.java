import java.util.LinkedList;
import java.util.Queue;

public class BREADTH_FIRST_SEARCH {
    public static class Node{
                int val;
        Node Right;
        Node Left;
        public Node (int val){
            this.val=val;
        }
    }
    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null)q.add(root);
        while (q.size()>0){
            Node temp =q.peek();
            if(temp.Left!=null)q.add(temp.Left);
            if(temp.Right!=null)q.add(temp.Right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Node root = new Node(100);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        Node e = new Node(60);
        Node f = new Node(70);
        root.Left=a;root.Right=b;
        a.Left=c;a.Right=d;
        b.Left=e;b.Right=f;
        bfs(root);
    }
}
