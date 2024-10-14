public class TWO_D_ARRAY_90DEGREE_ROTATION {

    public static void reverse (int nums[]){
        int start=0;
        int end= nums.length-1;
        while (start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void transpose(int matrix[][]){
        for (int i = 0; i <3 ; i++) {
            for (int j = i; j <3 ; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }


    public static void main(String[] args) {
        int A[][]={{1,2,3},{4,5,6},{7,8,9}};
        transpose(A);
        for (int i = 0; i <3 ; i++) {
            reverse(A[i]);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
