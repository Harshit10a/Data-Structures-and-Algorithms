public class Split_into_ODD_and_even {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node even(Node head){
        Node even =new Node(-1);
        Node odd =new Node(-1);
        Node temp=head;
        Node evenTail=even,oddTail=odd;
        while(temp!=null){
            if(temp.data%2==0){
                evenTail.next=temp;
                evenTail=evenTail.next;
            }
            else {
                oddTail.next=temp;
                oddTail=oddTail.next;
            }
            temp=temp.next;
        }
        evenTail.next=odd.next;
        oddTail.next=null;
        return even.next;
    }
    public static void display(Node head){
        Node temp =head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

        public static void main(String[] args) {
            Node one = new Node(1);
            Node two = new Node(2);
            Node three = new Node(3);
            Node four = new Node(4);
            Node five = new Node(5);
            Node six = new Node(6);
            one.next = two;
            two.next=three;
            three.next=four;
            four.next=five;
            five.next=six;//1->2->3->4->5->6->null

            display(even(one));
        }
    }
