public class INSERT_AT_END {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class linked{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int value){
            Node fresh =new Node(value);
            if(head==null){
                head=fresh;
            }else {
                tail.next=fresh;
            }
            tail=fresh;
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
        linked ll = new linked();
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.display();
    }
}
