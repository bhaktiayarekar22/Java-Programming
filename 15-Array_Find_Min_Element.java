public class Array_Find_Min_Element {
    public static void main(String[] args) {
        System.out.println("Find the Minimum element in thr Array");
        int[] arr = { 2, 5, -6, -25, -3, 7,  34, 8};
        int min_ele = minelement(arr);
        System.out.println("Minimum Element : " + min_ele);
    }

    static int minelement(int[] arr)
    {
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) 
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        return min;
    }
}
