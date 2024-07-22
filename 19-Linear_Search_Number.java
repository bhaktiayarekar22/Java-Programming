public class Linear_Search_Number {
    public static void main(String[] args) {
        System.out.println("Linear Search - Number");
        int[] arr = { 23, 45, 56, 67, 78,  89};
        int target = 89;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch (int[] arr, int target)
    {
        if (arr.length == 0)
        {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) 
        {
            int element = arr[index];
            if (element == target)
            {
                return index;
            }

        }
        return -1;

    } 
}
