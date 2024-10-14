public class Print_Increasing_Number {
    public static void print_increase(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        } print_increase(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n=10;
        print_increase(n);
    }
}
