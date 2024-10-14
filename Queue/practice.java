import java.util.Arrays;
import java.util.Stack;

public class practice {
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5,6,7,8,9};
        int res [] = new int[arr.length];
        Stack <Integer> st = new Stack<>();
        for (int i = 0; i <arr.length ; i++) {
            st.push(arr[i]);
        }
        while(st.size()>0){
            int i=0;
            res[i++]=st.pop();
        }
        System.out.println(Arrays.toString(res));
    }
}
