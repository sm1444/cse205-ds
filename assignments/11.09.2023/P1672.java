public class P1672{
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int max_wealth = 0;
        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
            {
                wealth+=accounts[i][j];
            }
            if(wealth>max_wealth) max_wealth = wealth;
            wealth = 0;
        }
        return max_wealth;
    }
}