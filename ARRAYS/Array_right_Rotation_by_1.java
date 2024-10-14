import java.util.Arrays;

public class Array_right_Rotation_by_1 {

    public static void main(String[] args) {

        int array[] = {2, 4, 6, 8, 10};
        int temp = array[array.length - 1];
        for (int i = array.length-1; i > 0 ; i--) {
            array[i ] = array[i-1];
        }
        array[0] = temp;
        System.out.println(Arrays.toString(array));
    }
}
