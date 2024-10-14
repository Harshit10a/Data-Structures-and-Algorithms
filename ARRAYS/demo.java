import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class demo {
    public static void main(String[] args) {
       int nums[] ={1,2,2,1,1,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
     HashSet<Integer> set = new HashSet<>();
        for( int val :map.values()){
            if(set.contains(val)) return false;
            else set.add(val);
        }
        return true;
    }
}
