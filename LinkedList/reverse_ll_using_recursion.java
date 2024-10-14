public class reverse_ll_using_recursion {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp =head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node reversell(Node head){
        if(head.next==null) return head;
        Node newhead =reversell(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
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
        five.next=six;
        System.out.println("Original Linked List");
        display(one);
        System.out.println();
        System.out.println("Reversed Linked List");
        Node rev =reversell(one);
        display(rev);
    }
}
