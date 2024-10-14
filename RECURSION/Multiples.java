public class Multiples {
    public static void mul(int n,int key){
        if(key==1){
            System.out.println(n);
            return;
        }
        mul(n,key-1);
        System.out.println(n*key);
    }

    public static void main(String[] args) {
        int num=5;
        int k=8;
       mul(num,k);
    }
}
