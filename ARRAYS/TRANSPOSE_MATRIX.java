public class TRANSPOSE_MATRIX {
    public static void print_matrix(int matrix[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int tran[][] = new int[3][3];
        System.out.println("BEFORE TRANSPOSE ");
        print_matrix(A);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tran[i][j] = A[j][i];
            }
        }
        System.out.println("AFTER TRANSPOSE");
        print_matrix(tran);
    }
}
