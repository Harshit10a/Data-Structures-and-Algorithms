import java.util.HashMap;

public class Most_Frequent_Element {
    public static void main(String[] args) {
        HashMap<Integer,Integer> mp = new HashMap();
        int cnt=1;
        int arr [] ={1,3,2,1,4,4};
        for (int i = 0; i < arr.length; i++) {
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            } else
                  mp.put(arr[i],cnt);
            cnt=1;
        }
        int max=0,anskey=-1;
        for(var e: mp.entrySet()){
            if(e.getValue()>max){ max= e.getValue();
            anskey=e.getKey();}
        }
        System.out.println(anskey+" "+max);
        System.out.println(mp.entrySet());
    }
}
