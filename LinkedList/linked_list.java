public class linked_list
{
    public static class Node{
        int data ;
        Node next;
        Node (int data){
            this.data=data;
        }
    }
    public static class linked{
        Node head=null;
        Node tail =null;
        void insert (int idx,int val){
            Node t =new Node(val);
            Node  temp=head;
            if(idx==length()){
                inserAtEnd(val);
                return;
            } else if (idx==0) {
                inserAtBeginning(val);
                return;
            } else if (idx<0||idx >length()) {
                System.out.println("WRONG INDEX PLEASE ENTER CORRECT INDEX");
            }
            for (int i = 0; i < idx-1; i++) {
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        int GetAt(int idx){
            Node temp=head;
            for (int i = 0; i <=idx ; i++) {
                temp=temp.next;
            }
            return temp.data;
        }
        void inserAtBeginning(int val){
            Node newnode =new Node(val);
            if(head==null){
                head=tail=newnode;
            }else {
                newnode.next = head;
                head = newnode;
            }
        }

        void inserAtEnd(int val){
            Node temp =new Node(val);
            if(head==null){
                head=temp;
            }else tail.next=temp;
            tail=temp;
        }
        void deleteAt(int idx){
            Node temp=head;
            if(idx==0) head=head.next;
            for (int i = 0; i <=idx-1 ; i++) {
                temp=temp.next;
            }
            if(idx==length()-1) tail=temp;
            temp.next=temp.next.next;
        }
        int length(){
            Node temp=head;
            int count =0;
            while(temp!=null){
                count++;
                temp=temp.next;

            }
            return count;
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
        linked ll =new linked();
        ll.inserAtEnd(4);
        ll.inserAtEnd(5);
        ll.inserAtEnd(6);
        ll.inserAtBeginning(1);

       ll.display();
        System.out.println();
        System.out.println(ll.GetAt(2));
    }

}
