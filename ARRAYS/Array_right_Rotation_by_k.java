import java.util.Arrays;

public class Array_right_Rotation_by_k {
    public static void reverse (int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void right_rotation(int nums[],int n,int k){
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10,12,14,16,18,20};
        int n= array.length;
        int rotate=4;
        right_rotation(array,n,rotate);
        System.out.println(Arrays.toString(array));
    }
}
