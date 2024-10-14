import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
    int num=1248;
    int temp=num;
    int step=0;
    while(num!=0){
        int last = num%10;
        if(temp%last==0){
            step++;
            num=num/10;
        } else {
            num=num/10;
        }
    }
        System.out.println(step);
    }
}
