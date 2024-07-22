
import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        System.out.println("Reverse the Array");

        int[] arr = {3, 5, 6, 8, 9, 4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

        static void reverse (int[] arr)
        {
            int start =0;
            int end = arr.length -1 ;

            while (start < end) 
            { 
                swap(arr, start, end);
                start ++;
                end --;
            }
        }

        static void swap(int[] arr, int index1, int index2)
        {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }


    
}
