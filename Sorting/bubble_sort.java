public class bubble_sort {

    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void printarr(int arrs[]) {
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {5, 4, 1, 3, 2};
        bubblesort(array);
        printarr(array);
    }
}
