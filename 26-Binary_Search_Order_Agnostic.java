public class Binary_Search_Order_Agnostic {
    public static void main(String[] args) {
        //       0      1   2  3  4  5    6    7   8   9  
    int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10}; //Assume it is sorted array but don't know ascending or descending 
    int target = 20;
    int ans = binarySearch(arr, target);
    System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target)
    {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

   

        while(start <= end)
        {
            int mid = start + (end - start)/2;  // To store large number in mid variable 

            if (arr[mid] == target)
            {
                return mid;
            }

            if (isAsc)
            {
                    if(target <arr[mid])
                {
                    end = mid - 1;
                }
                else 
                {
                    start = mid + 1;
                }
            }
            else
            {
                    if(target > arr[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }    
        }
            
        return -1;
    }
    
}
