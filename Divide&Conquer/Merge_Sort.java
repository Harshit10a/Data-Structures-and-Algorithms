public class Merge_Sort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergesort(int nums[], int start, int end) {
        if(start>=end){
            return;
        }
        int mid = start + (end - start) / 2;
        mergesort(nums, 0, mid);
        mergesort(nums, mid + 1, end);
        merge(nums, start, end, mid);
    }

    public static void merge(int array[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= ei) {
            temp[k++] = array[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            array[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 8, 6, 12, 10, 4, 14};
        mergesort(arr, 0, arr.length - 1);
        print(arr);
    }
}
