public class LinkedList_IMplementation {
    public static class Node{
        int val;
        Node next;
        Node (int val){
            this.val=val;
        }
    }
    public static class QueueLL{
        Node head =null;
        Node tail=null;
        int size =0;
        public  void add (int x){
            Node temp =new Node(x);
            if(size==0) head=tail=temp;
            else{
            tail.next=temp;
            tail=temp;
            }
            size++;
        }
        public int peek (){
            if(size==0) {
                System.out.println("Queue IS Empty");
                return -1;
            }
            return head.val;
        }
        public int remove (){
            if(size==0) {
                System.out.println("Queue IS Empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        public void display (){
            Node temp=head;
            if(size==0){
                System.out.println("Queue is Empty ");
                return;
            }
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    public  boolean isEmpty (){
            if(size ==0 ) return true;
            return false;
    }
    }

    public static void main(String[] args) {
        QueueLL q1 = new QueueLL();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display();



    }
}
