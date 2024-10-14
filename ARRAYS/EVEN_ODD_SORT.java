public class EVEN_ODD_SORT {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int num[]) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            if (num[start] % 2 == 1 && num[end] % 2 == 0) {
                swap(num, start, end);
                start++;
                end--;
            }
        }
        if (num[start] % 2 == 0) {
            start++;
        }
        if (num[end] % 2 == 1) {
            end--;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 5, 6, 7, 8};
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
