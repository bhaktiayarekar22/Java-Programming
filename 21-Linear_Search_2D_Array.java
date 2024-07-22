
import java.util.Arrays;

public class Linear_Search_2D_Array {
    public static void main(String[] args) {
        System.out.println("2D Array");
       

        int [][] arr = 
        {
            {12,23,45},
            {26,47,97},
            {75,48,25}
        };
        int target = 25;
        int[] ans = search(arr, target);
        
        System.out.println("Element found at index : " + Arrays.toString(ans));

    }

    static int[] search(int[][] arr ,int target)
    {
        
        for (int row =0 ; row < arr.length ; row++)
        {
            for(int col = 0 ; col < arr[row].length; col++)
            {
                if(arr[row][col] == target)
                {
                    return new int[]{row,col};
                }
            }
        }

        return new int[]{-1,-1};

    } 
}
