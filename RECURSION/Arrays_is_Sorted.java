public class Arrays_is_Sorted {
    public static  boolean check(int n[],int i){
        if(i==n.length-1){
            return true;
        }
        if(n[i]>n[i+1]){
            return false;
        }
        return check(n,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,5,4,3,2};
        System.out.println(check(arr,0));
    }
}
