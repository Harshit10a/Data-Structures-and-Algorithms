public class Implementation {
    public static class Node {
        int val;
        Node left;
        Node right;
        public Node (int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        Node e = new Node(60);
        root.left=a;
        root.right=b;
        a.left=c;a.right=d;
        b.right=e;

    }
}
