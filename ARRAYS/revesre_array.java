import java.util.Arrays;

public class revesre_array {
    public static int reverse(int array[]) {
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int temp=array[end];
            array[end] = array[start];
            array[start]=temp;
            start ++;
            end--;
        }
//        System.out.println(Arrays.toString(array));
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12};
        reverse(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
