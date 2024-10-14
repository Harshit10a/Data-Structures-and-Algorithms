public class trapping_rain_water {
    public static int trapped(int height[]) {
        int n = height.length;
//        for calculating left max
        int left_max[] = new int[n];
        left_max[0] = height[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }
//        for calculating right max
        int right_max[] = new int[n];
        right_max[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(height[i], right_max[i + 1]);
        }
        int trappedwater = 0;
        for (int j = 0; j < n; j++) {
            int waterlevel = Math.min(left_max[j], right_max[j]);
            trappedwater += waterlevel - height[j];
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapped(arr));
    }
}
