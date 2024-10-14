public class last_occurence {
    public static int last(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound = last(arr,key,i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int array[]={1,2,4,5,4,8,5,1};
        System.out.println(last(array,5,0));
    }
}
