public class Search_In_Rotated_array {
    public static int search(int arr[], int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && target <= arr[mid]) {
                return search(arr, target, start, mid - 1);
            } else {
                return search(arr, target, mid + 1, end);
            }
        } else {
            if (arr[mid] <= target && target < arr[end]) {
                return search(arr, target, mid + 1, end);
            } else {
                return search(arr, target, start, mid - 1);
            }
        }
    }

        public static void main (String[]args){
            int array[] = {4, 5, 6, 7, 0, 1, 2};
            int target = 0;
            int index = search(array, target, 0, array.length - 1);
            System.out.println(index);

        }
    }
