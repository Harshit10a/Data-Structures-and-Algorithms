public class subarray {
    public static void printsubarray(int numbers[]){
        int sum=0;
        for (int i = 0; i <numbers.length ; i++) {
            for(int j=i;j<numbers.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                    sum=sum+numbers[k];
                }
                System.out.print("    sum = "+sum);
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        printsubarray(array);
    }
}
