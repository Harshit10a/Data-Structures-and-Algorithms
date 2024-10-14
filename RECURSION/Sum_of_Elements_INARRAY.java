import java.util.Arrays;

public class Sum_of_Elements_INARRAY {
    public static int sum(int num[],int idx){
        if(idx==num.length-1) return num[idx];

         int small=sum(num,idx+1);
         return num[idx]+small;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        System.out.println("Sum of array "+Arrays.toString(arr)+" = "+sum(arr,0));
    }
}
