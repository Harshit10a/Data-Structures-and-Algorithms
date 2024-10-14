import java.util.Scanner;

public class product {
    public static int product(int a,int b){
        int mul =a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int multiply=product(num1,num2);
        System.out.println("The product of the values = "+multiply);

    }
}
