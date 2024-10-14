import java.util.Arrays;

public class TWO_D_ARRAY_MULTIPLICATION {
    public static void main(String[] args) {
        int A[][]={{1,2,3},{4,5,6},{7,8,9}};
        int B[][]={{1,2,3},{4,5,6},{7,8,9}};
        int mul[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for (int j = 0; j <3 ; j++) {
                for(int k=0;k<3;k++){
                    mul[i][j]+=(A[i][k] * B[k][j]);
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }

    }
}
