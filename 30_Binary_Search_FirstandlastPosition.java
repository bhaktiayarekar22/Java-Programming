import java.util.Arrays;

public class Binary_Search_FirstandlastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8, 8, 9, 9, 9};
        int target = 7;
        int[] awr = searchRange(nums, target);
        System.out.println(Arrays.toString(awr));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // check first occurrence
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function just returns the index value of target 
    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find mid
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
