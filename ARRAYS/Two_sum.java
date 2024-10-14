public class Two_sum {
    public static void main(String[] args) {
        int nums[]={2,11,7,15};
        int target=17;
        for (int i = 0; i < nums.length ; i++) {
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("["+j + ","+i+"]");
                }
            }
        }
    }
}
