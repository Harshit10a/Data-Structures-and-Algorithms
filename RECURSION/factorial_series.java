public class factorial_series {
    public static int facti(int n){
        int facto=1;
        if(n==0){
            return 1;
        }else {
            return n*facti(n-1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("The Factorial of "+ n +" is "  );
        System.out.println(facti(n));
    }
}
