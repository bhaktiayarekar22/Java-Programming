public class Binary_Search_Smallerletter {
    public static void main(String[] args) {
    char[] letters = {'c','f','j'};
    char target ='j';
    char ans = nextGreatestLetter(letters, target);
    System.out.println(ans);
    }

    public static char nextGreatestLetter(char[] letters, char target)
    {   
        int start = 0;
        int end = letters.length - 1;

        while(start <= end)
        {
            // find mid
            int mid = start + (end - start)/2;  // To store large number in mid variable 

            if(target <letters[mid])
            {
                end = mid - 1;
            }
            else 
            {
                start = mid + 1;
            }
        
        }
        return letters[start % letters.length];

    }
}
