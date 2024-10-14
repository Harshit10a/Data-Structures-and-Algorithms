import java.util.Arrays;

public class Sum_of_2_Arrays {
    public static void main(String[] args) {
        int nums1[] = {1,0,0,0};int n1=nums1.length;
        int nums2[] = {1,0,0,0};int n2= nums2.length;
        int result[] = new int[n1 > n2 ? n1 : n2];
        int carry=0;
        int i=nums1.length-1; int j=nums2.length-1;int k=result.length-1;
        while (k>=0){
            int d=carry;
            if(i>=0) d+=nums1[i];
            if(j>=0) d+=nums2[i];
            carry=d/10;
            d=d%10;
            result[k] =d;
            i--;j--;k--;
        }
        System.out.println(Arrays.toString(result));
    }
}
