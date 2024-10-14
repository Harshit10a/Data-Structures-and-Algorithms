public class largest_No {
    public static int getlargest(int numbers[]){
         int largest=Integer.MIN_VALUE;
        for (int i = 0; i <numbers.length ; i++) {
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        System.out.println("largest Number in the given array is "+getlargest(array));

    }
}
