public class Second_largest {
    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int second_largest = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > second_largest && numbers[j] != largest) {
                second_largest = numbers[j];
            }
        }
        return second_largest;
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        System.out.println("Second largest Number in the given array is " + getlargest(array));
    }
}
