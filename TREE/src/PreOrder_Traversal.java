public class PreOrder_Traversal {
    public static class Node {
        int val;
        Node left;
        Node rigth;
        public Node(int val){
            this.val=val;
        }
    }
    public static void pre(Node root){
        if (root==null)return;
        System.out.println(root.val);
        pre(root.left);
        pre(root.rigth);
    }
    public static void main(String[] args) {
        Node root = new Node(100);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        Node e = new Node(60);
        Node f = new Node(70);
        root.left=a;root.rigth=b;
        a.left=c;a.rigth=d;
        b.left=e;b.rigth=f;
        pre(root);

    }
}
