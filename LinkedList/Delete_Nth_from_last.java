public class Delete_Nth_from_last {
     public static void display(Node head){
        Node temp =head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
         System.out.println();
    }
    public static void Delete_nth(Node head, int nth){
        Node slow=head;
        Node fast=head;
        for (int i = 1; i <=nth ; i++) {
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
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
        display(a);
        Delete_nth(a,2);
        display(a);
    }
}
