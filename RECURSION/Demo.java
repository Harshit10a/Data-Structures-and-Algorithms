import java.util.Arrays;

public class Demo {
    public static boolean present(int array[],int target){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,8,7,8,8};
        int target=8;
        int num[]={-1,-1};

        if(arr.length>1&&present(arr,target)){
            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i]==target){
                    for (int j = i+1; j < arr.length ; j++) {
                        if(arr[j]==target){
                            num[0]=i;
                            num[1]=j;
                        }
                    }
                }
            }
        } else if (arr.length==1) {
            num[0]=0;
            num[1]=0;
        }
        else if(present(arr,target)){
            num[0]=-1;
            num[1]=-1;
        }
        System.out.println(Arrays.toString(num));

    }}
