public class Binary_Search_Floor {
        public static void main(String[] args) {
            //       0      1   2  3  4  5  6    7  8
        int[] arr = {-18, -12, -4, 0, 2, 3, 22, 25 ,89}; //Assume it is sorted array - ascending
        int target = 24;
        int ans = floor(arr, target);
        System.out.println(ans);
        }
        static int floor(int[] arr, int target)
        {
            int start = 0;
            int end = arr.length - 1;
    
            while(start <= end)
            {
                // find mid
                int mid = start + (end - start)/2;  // To store large number in mid variable 
    
                if(target <arr[mid])
                {
                    end = mid - 1;
                }
                else if(target > arr[mid])
                {
                    start = mid + 1;
                }
                else
                {
                    return mid;
                }
            }
            return end;
            // floor - greatest number =< target
        }
    
    
}
