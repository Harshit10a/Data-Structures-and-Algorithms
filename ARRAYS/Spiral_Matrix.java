public class Spiral_Matrix {
    public static void spiral(int matrix[][]){
        int top=0;
        int left=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        while(top<=bottom&& left<=right){
            for (int i = left; i <=right ; i++) {
                System.out.print(matrix[top][i]+" ");
            }
            for (int i = top+1; i <=bottom ; i++) {
                System.out.print(matrix[i][right]+" ");
            }
            for (int i = right-1; i >=left ; i--) {
                if(top==bottom){
                    break;
                }
                System.out.print(matrix[bottom][i]+" ");
            }
            for (int i = bottom-1; i >=top+1 ; i--) {
                if(left==right){
                    break;
                }
                System.out.print(matrix[i][left]+" ");
            }
            top++;
            left++;
            bottom--;
            right--;
        }
    }
    public static void main(String[] args) {
        int nums[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(nums);
    }
}
