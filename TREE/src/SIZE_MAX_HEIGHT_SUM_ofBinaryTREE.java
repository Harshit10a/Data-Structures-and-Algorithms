public class SIZE_MAX_HEIGHT_SUM_ofBinaryTREE {
    public static class Node {
        int val;
        Node left;
        Node right;
        public Node (int val){
            this.val=val;
        }
    }
    public  static void preorder(Node root){
        if(root==null)return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static int Height(Node root){
        if(root==null)return 0;
        if(root.left==null&& root.right==null)return 0;
        return 1+ Math.max(Height(root.left),Height(root.right));
    }
    public static int maxi(Node root){
        if(root==null)return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maxi(root.left),maxi(root.right)));
    }
    public static int sum(Node root){
        if(root==null)return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static int size(Node root){
        if(root==null)return 0;
        return 1+size(root.left)+size(root.right);
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
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(maxi(root));
        System.out.println(Height(root));
    }
}
