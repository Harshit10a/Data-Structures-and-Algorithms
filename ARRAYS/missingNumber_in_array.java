public class missingNumber_in_array {
    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 5, 0};
        int n = 5;
        int result = n * (n + 1) / 2;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += nums[i];
        }
        System.out.println(result - ans);

    }
}
