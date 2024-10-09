public class Display {
    public static class Node{
        int val;
        Node Right;
        Node Left;
        public Node (int val){
            this.val=val;
        }
    }
    public static void display (Node N){
        if(N==null)return;
        System.out.print(N.val+" -> ");
        if(N.Left!=null)System.out.print(N.Left.val+",");
        if(N.Right!=null)System.out.print(N.Right.val);
        System.out.println();
        display(N.Left);
        display(N.Right);
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
        display(root);

    }
}
