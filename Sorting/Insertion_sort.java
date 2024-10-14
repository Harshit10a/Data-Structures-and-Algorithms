import java.util.Arrays;

public class Insertion_sort {
    public static void sort(int num[]) {
        for (int i = 1; i < num.length; i++) {
            int j = i;
            while (j > 0 && num[j] < num[j - 1]) {
                int temp = num[j];
                num[j] = num[j - 1];
                num[j - 1] = temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
