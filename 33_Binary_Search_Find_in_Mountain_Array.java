public class Binary_Search_Find_in_Mountain_Array
{
    public static void main(String[] args) {
        int[] arr ={2,3,4,5,6,7,8,5,4,3,2,1};
        int target = 6;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr, int target)
    {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr, target,0, peak);
        if (firstTry!= -1)
        {
            return firstTry;
        }
        //try to search in second half
        return binarySearch(arr, target, peak+1, arr.length - 1);

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1])
            {
                end = mid;  //you are in dec part of array this may be the ans but look at left this why end is not equal to end = mid -1
            }
            else{
                start = mid + 1;
            }
        }
        //in the end, start == end and pointing to the largest number because of the 2 check box
        //start and end are always trying to find max elemr=ent in the above 2 checks 
        //hence, when they are pointing to just one element , that is the max one becuse that is what the check say
        //at every time is gives max one becuase only one element remaining ,hence cuz of above line that is the best possible ans

        return start; //or end  (start = end)
        
    }

    static int binarySearch(int[] arr, int target , int start , int end)
    {

       
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