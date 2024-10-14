public class Seacrh_in_2D {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element Found At index " + i+" "+j);
                    return true;
                }
            }

        }
        System.out.println(" Element Not Found ");
        return false;
    }

    public static void main(String[] args) {
        int nums[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        search(nums, 5);
    }
}
