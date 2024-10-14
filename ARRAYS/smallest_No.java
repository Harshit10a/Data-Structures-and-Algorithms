public class smallest_No {
    public static void main(String[] args) {
        int arr[] = {2, 96, 69, 77, 145, 1, 20};
        int smallest = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
                index = i;
            }
        }
        System.out.println("The samllest Number in the given array is = " + smallest
                + " and found at index " + index);
    }
}
