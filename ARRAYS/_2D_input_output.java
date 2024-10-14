import java.util.Arrays;
import java.util.Scanner;

public class _2D_input_output {
    public static void main(String[] args) {
        int r,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        r=sc.nextInt();
        System.out.println("Enter the number of coloumn");
        c=sc.nextInt();
        int arr [][] = new int[r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
