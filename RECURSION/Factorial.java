public class Factorial {
    public static int  Facti(int n){
        if(n==0){
            return 1;
        }
        int fac = Facti(n-1);
        int factorial = n* Facti(n-1);
        return  factorial;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Facti(n));
    }
}
