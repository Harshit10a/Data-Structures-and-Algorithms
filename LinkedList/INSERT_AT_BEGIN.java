public class INSERT_AT_BEGIN {
    public static  class Node{
        int data;
        Node next;
        Node(int data){
          this.data=data;
          this.next=null;
        }
    }
    public static class Linked_List{
        Node head=null;
        Node tail=null;
         void insertAtBegin(int value){
             Node freshNode =new Node(value);
             if(head==null){
                 head=tail=freshNode;
             }else {
                 freshNode.next=head;
                 head=freshNode;
             }
         }
        void display(){
            Node temp =head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Linked_List ll =new Linked_List();
        ll.insertAtBegin(5);
        ll.insertAtBegin(6);
        ll.insertAtBegin(7);
        ll.display();
    }


}
