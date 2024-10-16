public class nth_From_last_2 {
    public static Node lastnth(Node head,int nth){
        Node slow=head;
        Node fast=head;
        for (int i = 1; i <=nth ; i++) {
            fast=fast.next;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node a =new Node(5);
        Node b =new Node(6);
        Node c =new Node(7);
        Node d =new Node(8);
        Node e =new Node(9);
        Node f =new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        
    }
}
