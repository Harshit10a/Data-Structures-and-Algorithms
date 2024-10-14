public class BasicLinkedList {


    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    } public static void main(String[] args) {
        Node one = new Node(5);
        Node two = new Node(10);
        Node three = new Node(15);
        Node four = new Node(20);
        Node five = new Node(25);
        one.next = two; //5 ->10 15 20 25
        two.next=three; //5 -> 10 -> 15 20 25
        three.next=four; //5 -> 10 -> 15 -> 20 25
        four.next=five;  //5 -> 10 -> 15 -> 20 -> 25

    }
}
