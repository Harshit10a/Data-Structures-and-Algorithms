public class Intersection_of_Two_linkedList {

    public static Node lastnth(Node head, int nth){
        Node slow=head;
        Node fast=head;
        for (int i = 1; i <=nth ; i++) {
            fast=fast.next;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node getIntersectionNode(Node headA, Node headB) {
        Node tempA=headA;
        Node tempB=headB;
        int lengthA=0;
        int lengthB=0;
        while(tempA!=null){
            lengthA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            lengthB++;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;
        if(lengthA>lengthB){
            int steps =lengthA-lengthB;
            for(int i=1;i<=steps;i++){
                tempA=tempA.next;
            }
        }

        else {
            int steps =lengthB-lengthA;
            for(int i=1;i<=steps;i++){
                tempB=tempB.next;
            }
        }


        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
    public static void main(String[] args) {

    }
}
