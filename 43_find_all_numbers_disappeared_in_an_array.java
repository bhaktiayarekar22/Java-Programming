import java.util.ArrayList;
import java.util.List;

public class find_all_numbers_disappeared_in_an_array {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 1,2};
        List<Integer> missingNumbers = findDisappearedNumbers(arr);
        System.out.println(missingNumbers); // Print the missing numbers
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
