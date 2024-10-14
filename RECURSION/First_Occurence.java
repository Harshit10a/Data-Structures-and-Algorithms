public class First_Occurence {
    public static int first(int arr[],int key,int i){
        if(i== arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first(arr,key,i+1);

    }
    public static void main(String[] args) {
        int array[]={1,2,3,5,6,8,6,5};
        System.out.println(first(array,5,0));

    }
}
