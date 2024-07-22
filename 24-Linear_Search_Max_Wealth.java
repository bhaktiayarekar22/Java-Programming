public class Linear_Search_Max_Wealth {
    public static void main(String[] args) {
        // person = row
        // account =col
    }
    public int maximumWealth(int[][] accounts)
    {
        int ans = accounts[0][0];
        for (int person = 0; person < accounts.length; person++)
        {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) 
            {
                sum = sum + accounts[person][account];    
            }

            // check with all rowsum
            if(sum > ans)
            {
                ans = sum;
            }
        }
        return ans;
    }
}
