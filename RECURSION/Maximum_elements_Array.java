public class Maximum_elements_Array {
    public static int maximum(int num[],int ix){
        int max=Integer.MIN_VALUE;
        if(ix== num.length-1) return num[ix]; ;
         int small=maximum(num,ix+1);
        return Math.max(small,num[ix]);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,1};
        System.out.println(maximum(arr,0));

    }
}
