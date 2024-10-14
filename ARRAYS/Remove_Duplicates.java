public class Remove_Duplicates {
    public static int remove(int nums[]) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }

        }return count;
    }
        public static void main (String[]args){
            int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
            System.out.println(remove(arr));
        }
    }
