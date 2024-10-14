import java.util.*;

public class Demo {
    public static void main(String[] args) {
         int nums [] ={1,3,2,1,3,2,2};
         int left=0,pairs=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        for (int i = 0; i < list.size() ; i++) {

            if(list.get(i)%2!=0)left++;
            pairs = pairs + list.get(i)/2;
        }

    }
}
