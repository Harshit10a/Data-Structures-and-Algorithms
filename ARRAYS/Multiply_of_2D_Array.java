public class Multiply_of_2D_Array {
    public static void main(String[] args) {
        int A [][] = {{1,2,3},{4,5,6},{7,8,9} };
        int B [][] = {{1,2,3},{4,5,6},{7,8,9} };
        int mul [][] = new int[3][3];
        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j <A[i].length ; j++) {
                for (int k = 0; k < 3; k++) {
                    mul[i][j]+=A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j <A[i].length ; j++) {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}
