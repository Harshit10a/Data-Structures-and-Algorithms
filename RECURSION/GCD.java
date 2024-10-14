public class GCD {
    public static int great(int x,int y){
        if(y==0){
            return x;
        }
        return great(y,x%y);
    }
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 24;
        System.out.println(great(num1,num2));


    }
}
