public class nth_From_Last {
    public static Node nthnode(Node head,int nth){
        int size=0;
        Node temp= head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m = size -nth +1;
        temp=head;
        //visting the mth node from start
        for (int i = 1; i <=m-1 ; i++) {
        temp=temp.next;
        }
        return temp;
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
        Node b =new Node(10);
        Node c =new Node(15);
        Node d =new Node(20);
        Node e =new Node(25);
        Node f =new Node(30);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        //5->10->15->20->25->30
        Node temp=nthnode(a,3);
        System.out.println(temp.data);
    }
}
