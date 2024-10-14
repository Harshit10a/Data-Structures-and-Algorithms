public class pairs {
    public static void pair(int array[]) {
        int tp=0;
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + current + "," + array[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("The total numbers of pairs = "+tp);

    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        pair(arr);

    }
}
