import java.util.Scanner;

public class half_pyramid_mirrortraingle {
    public static void pattern(int n){
        for (int i = 1; i <=n ; i++) {
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //for stars
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
