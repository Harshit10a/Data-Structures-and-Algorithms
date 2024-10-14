import java.util.Queue;

public class ArrayImplementation {
     public static class QueueA{
         int f=-1;
         int r=-1;
         int size=0;
         int arr[] =new int[100];
         public void add (int val){
             if(r==arr.length) {
                 System.out.println(" QUEUE IS FULL ");
                 return ;
             }
             if(f==-1) {
                 f=r=0;
                 arr[0]=val;
             }
             else{
                 arr[++r] = val;
             }
             size++;
         }
          public  int remove() {
             if(size==0){
                 System.out.println(" Queue is empty ");
                 return -1;
             }
             f++;
             size--;
             return arr[f-1];
         }
         public  int peek() {
             if(size==0){
                 System.out.println(" Queue is empty ");
                 return -1;
             }
             return arr[f];
         }
         public boolean isempty(){
             if(size==0)return true;
             return false;

         }
         public void display (){
             if(size==0){
                 System.out.println("QUEUE IS EMPTY ");
             }
             for (int i = f; i <=r ; i++) {
                 System.out.print(arr[i]+" ");
             }
         }

     }

    public static void main(String[] args) {
        QueueA q1 =new QueueA();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display();

    }
}
