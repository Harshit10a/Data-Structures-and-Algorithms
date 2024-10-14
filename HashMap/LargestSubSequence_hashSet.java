import java.util.HashSet;

public class LargestSubSequence_hashSet {
    public static int largest(int nums[]){
        int max=0;
        HashSet<Integer>set = new HashSet<>();
        for(int num : set){
            set.add(num);
        }
     for(int num :set){
         if(!set.contains(num-1)){
             int currnum = num;
             int currstreak=1;
             while(set.contains(currnum+1)){
                 currstreak++;
                 currnum++;
             }
             max =Math.max(max,currstreak);
         }
     }
return max;
    } 
    public static void main(String[] args) {

    }
}
