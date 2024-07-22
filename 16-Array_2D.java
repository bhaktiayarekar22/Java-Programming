
import java.util.Scanner;


public class Array_2D {
    public static void main(String[] args) {
        System.out.println("2D Array");
        Scanner in = new Scanner(System.in);

        int [][] arr = new int[3][3];

        for (int row =0 ; row < arr.length ; row++)
        {
            for(int col = 0 ; col < arr[row].length; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }

        for (int row =0 ; row < arr.length ; row++)
        {
            for(int col = 0 ; col < arr[row].length; col++)
            {
               System.out.print(arr[row][col] + " " ); 
            }
            System.out.println();
        }

        // or you can use ---
        /*  for (int row =0 ; row < arr.length ; row++)
        {
         System.out.print(Arrays.toString(arr[row])); 
        }
        } */

    }
}
