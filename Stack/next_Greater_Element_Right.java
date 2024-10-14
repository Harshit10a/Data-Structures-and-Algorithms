import java.util.Arrays;
import java.util.Stack;

public class next_Greater_Element_Right {
    public static void main(String[] args) {
      int arr [] = {1,5,3,2,1,6,3,4};
      int  n =arr.length;
      int result [] =new int[n];
      Stack<Integer> st = new Stack<>();
        for (int i = n-1; i >=0 ; i--) {
            if(st.isEmpty()) result[i]=-1;
            else if(st.size()>0 && st.peek()>arr[i]){
                result[i]=st.peek();
            }
                while(st.size()>0 && st.peek()<arr[i]){
                    st.pop();
                }
                if(st.size()==0)result[i]=-1;
                else  result[i]=st.peek();

            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }
}
