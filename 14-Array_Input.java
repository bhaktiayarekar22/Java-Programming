
import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 element of array");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Array :");
        for (int i = 0; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        // or  you can use -- 
        //  System.out.println(Arrays.toString(arr));


    }
}
