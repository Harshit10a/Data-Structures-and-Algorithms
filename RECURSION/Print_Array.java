public class Print_Array {
    public static void print(int num[],int idx){
        if(idx==num.length){
            return;
        }
        System.out.println(num[idx]);
        print(num,idx+1);

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        print(arr,0);
    }
}
