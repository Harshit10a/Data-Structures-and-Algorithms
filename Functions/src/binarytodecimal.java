import java.util.Scanner;

public class binarytodecimal {

    public static void binomial(int n) {
        int mynum=n;
        int pow = 0;
        int dec = 0;
        while (n > 0) {
            int LD = n % 10;
            dec = dec + (LD * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println("Decimal of " + mynum + " = " + dec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        binomial(num);
    }
}
