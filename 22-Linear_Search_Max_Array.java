

public class Linear_Search_Max_Array {

    public static void main(String[] args) {
        System.out.println("2D Array");
       

        int [][] arr = 
        {
            {12,23,45},
            {26,99,97},
            {75,48,25}
        };
        
        int ans = search_max(arr);
        
        System.out.println("Element MAX at index : " + ans);

    }

    static int search_max(int[][] arr)
    {
        int max = arr[0][0];   
        for (int row =0 ; row < arr.length ; row++)
        {
            for(int col = 0 ; col < arr[row].length; col++)
            {
                if(arr[row][col] > max)
                {
                    max = arr[row][col];

               
                }
            }
        }

        return max;

    } 
}


