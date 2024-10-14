public class Linear_Search {
    public static boolean search(int num[],int key,int idx){
        if(idx>=num.length)  return false;
        if(num[idx]==key) return (true);
        return search(num,key,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16,20};
        int target =12;
        System.out.println(search(arr,target,0));
    }
}
