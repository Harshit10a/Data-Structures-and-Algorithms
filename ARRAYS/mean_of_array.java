public class mean_of_array {
    public static void mean(int arr[]){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
        }
        int mean =sum/ (arr.length);
        System.out.println("The mean of the given array is = "+mean);
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        mean(array);
    }
}
