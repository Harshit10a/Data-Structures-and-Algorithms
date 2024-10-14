public class Return_All_Indices {
    public static void indices(int num[], int key, int idx) {
        if (idx >= num.length) return;
        if (num[idx] == key) {
            System.out.println(idx);
        }
        indices(num, key, idx + 1);

    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 2, 5, 2, 4, 6, 2};
        int target = 2;
        indices(arr,target,0);
    }
}
