public class Deep_copy_Of_ll {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node copy(Node head){
        Node fresh =new Node(-1);
        Node temp1=head;
        Node temp2=fresh;
        while(temp1!=null){
            Node nn =new Node(temp1.data);
            temp2.next=nn;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return fresh.next;
    }
    public static void display(Node head){
        Node temp =head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node one = new Node(5);
        Node two = new Node(10);
        Node three = new Node(15);
        Node four = new Node(20);
        Node five = new Node(25);
        one.next = two; //5 ->10 15 20 25
        two.next=three; //5 -> 10 -> 15 20 25
        three.next=four; //5 -> 10 -> 15 -> 20 25
        four.next=five;  //5 -> 10 -> 15 -> 20 -> 25
      Node clone= copy(one);
      display(clone);

    }
}
