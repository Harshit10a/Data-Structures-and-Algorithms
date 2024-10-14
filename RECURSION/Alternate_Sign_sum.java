public class Alternate_Sign_sum {
    public static int alternate(int n){
        if(n==0){
            return n;
        }
        if(n%2==0){
            return alternate(n-1)- n;
        }else  return alternate(n-1)+ n;
    }
    public static void main(String[] args) {
        int num =5;
        System.out.println(alternate(num));
    }
}
