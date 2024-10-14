import java.util.Scanner;

public class primeinrange {
    public static boolean prime(int n) {
        boolean isprime = true;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    public static void primeinrange(int a){
        for (int i = 2; i <a-1 ; i++) {
            prime(i);
            if(prime(i)==true){
                System.out.print(" "+i);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the range ");
        int N = sc.nextInt();
        primeinrange(N);
    }
}
