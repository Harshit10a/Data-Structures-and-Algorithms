public class LINKED_LIST_IMPLEMENTATION {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static  class LLStack {
        Node head=null;
        int size=0;
        void push(int x){
            Node temp= new Node(x);
            temp.next=head;
           head=temp;
           size++;
        }
        void displayrec(Node h){
            if(h==null)return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void display_REV(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){

                System.out.print("Stack is Empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;
        }

    }
    public static void main(String[] args) {

    }
}
