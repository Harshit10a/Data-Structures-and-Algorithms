import java.util.Arrays;

public class Sort_Colors {
    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 2, 1, 0, 1, 2, 1, 2};
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if ((nums[mid] == 0))
            {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1)
            {
                mid++;
            } else
            {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }

        }
        System.out.println(Arrays.toString(nums));
    }
}
