import java.util.Arrays;

public class Array_left_Rotation_by_K {
    public static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void left_rotation(int nums[], int n, int k) {
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        int n = array.length;
        int k = 2;
        left_rotation(array, n, k);
        System.out.println(Arrays.toString(array));
    }
}
