public class Search_in_sorted_2D {
    public static boolean search(int matrix[][],int key){
        int row=0; int col=matrix[0].length-1;
        while(row< matrix.length&&col>=0){
            if(matrix[row][col]==key){
                System.out.println("Element Found at ("+row+","+col+")");
                return true;
            } else if (key<matrix[row][col]) {
                col--;
            }else row++;
        }
        System.out.println("Element Not Found! ");
        return false;
    }
    public static void main(String[] args) {
        int nums[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
search(nums,12);
    }
}
