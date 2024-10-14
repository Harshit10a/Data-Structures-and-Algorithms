public class CircularQueue_ARRAY_Imple {

    public static class circular {
        int front = -1;
        int rear = -1;
        int size = 0;
        int arr[] = new int[8];

        public void add(int x) throws Exception {
            if (size == arr.length) {throw new Exception("QUEUE is FUll");}
            else if (size == 0) {
                front = rear = 0;
                arr[0] = x;
            } else if (rear < arr.length - 1) arr[++rear] = x;
            else if (rear == arr.length) {
                rear = 0;
                arr[0] = x;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0) throw new Exception(" QUEUE IS EMPTY ");
            else if(front==arr.length-1){
                int top=arr[front];
                front=0;
                return top;
            }
            else{
                int top=arr[front];
                if(front==arr.length-1) front=0;
                else front++;
                size--;
                return top;
            }


        }
        public int peek () throws Exception{
            if(size==0) throw new Exception(" QUEUE IS EMPTY ");
            else return arr[front];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display (){
            if(size==0) System.out.println("QUEUE IS EMPTY");
            else if(front<=rear){
                for (int i = front; i <=rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for (int i = front; i <arr.length ; i++) {
                    System.out.print(arr[i]+" ");
                }
                for (int i = 0; i <=rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) throws Exception {
       circular a = new circular();
       a .display();
       a.add(1);
       a.add(2);
       a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a .display();



    }
}
