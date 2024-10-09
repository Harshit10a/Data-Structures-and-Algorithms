public class Nth_Level_Node {
    public static class Node{
        int val;
        Node Right;
        Node Left;
        public Node (int val){
            this.val=val;
        }
    }
    public static void nth(Node root,int n){
        if(root==null)return;
        if(n==1) System.out.print(root.val+" ");
        nth(root.Left,n-1);
        nth(root.Right,n-1);
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
        nth(root,2);
    }
}
