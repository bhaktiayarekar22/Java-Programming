public class Binary_Search_Rotated_Array_With_Duplicates {
    public static void main(String[] args)
    {
       int[] arr = {4,5,6,7,0,1,2,2,2,2,2};
       int target = 5;
       System.out.println(findPivot(arr));
       System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target)
    {
        int pivot = findPivot(nums);
        //if  you did not find pivot then just do binary search

        if (pivot == -1)
        {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        //if pivot is found then search in two asc sorted array
        if(nums[pivot] == target)
        {
            return pivot;
        }
        if ( target >= nums[0])
        {
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length -1);
    }

    static int binarySearch(int[] arr, int target, int start , int end)
    {
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
        return -1;
    }

    static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length -1;
        while(start <= end)
        {
            int mid = start + (end - start) /2;
            if(mid < end && arr[mid] > arr[mid +1])
            {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1])
            {
                return mid -1;
            }
            if (arr[mid] == arr[start] && arr[mid] == arr[end])
            {
                //Note : what if these element at start and end  were pivot ?
                if(arr[start] > arr[start +1])
                {
                    return start;
                }
                start++;
                //check end is pivot
                if(arr[end] < arr[end -1])
                {
                    return end-1;
                }
                end--;
            }
            else if( arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]))
            {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
           
        }
        return -1;
    }
}
