import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        int fac=1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int facti = fact(num);
        System.out.println("The factoiral of "+num+" is = " + facti);
    }
}
