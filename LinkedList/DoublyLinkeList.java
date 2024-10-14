public class DoublyLinkeList {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head,int val){
        Node fresh =new Node(val);
        fresh.next=head;
        head.prev=fresh;
        head=fresh;
        return head;
    }
    public static void insertAtTail(Node tail,int val){
        Node end =new Node(val);
       tail.next=end;
       end.prev=tail;
       tail=end;
    }
    public static void insertAtAny(Node head,int data,int idx){
        Node S = head;
        for (int i =1 ; i <idx-1 ; i++) {
            S=S.next;
        }
        Node R =S.next;
        Node t =new Node (data);
        // S<->T<->R
        t.next=R;
        t.prev=S;
        R.prev=t;
        S.next=t;

    }

    public static void main(String[] args) {
        Node a =new Node(1);
        Node b =new Node(2);
        Node c =new Node(3);
        Node d =new Node(4);
        Node e =new Node(5);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        display(a);
        insertAtAny(a,69,3);
        display(a);
    }
}
