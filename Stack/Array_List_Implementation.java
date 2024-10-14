import java.util.ArrayList;

public class Array_List_Implementation {
    public static class stack{
        ArrayList <Integer> s =new ArrayList<>();
        public  boolean isempty(){
            if(s.size()==0){
                return true;
            }else return false;
        }
        public  int pop(){
            int top =s.get(s.size()-1);
            s.remove(s.size()-1);
            return top;
        }
        public void push(int data){
            s.add(data);
        }
        public int peek(){
            return s.get(s.size()-1);
        }
    }

    public static void main(String[] args) {
      stack s =new stack();
      s.push(1);
      s.push(2);
      s.push(3);
    }
}
