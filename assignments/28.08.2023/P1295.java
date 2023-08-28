public class P1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000)
        //     {
        //         count++;
        //     }
        // }
        for(int i = 0;i<nums.length;i++)
        {
            int x = nums[i];
            int sum = 0;
            while(x>0)
            {
                int r = x%10;
                sum++;
                x = x/10;
            }
            if(sum%2==0)
            {
                count++;
            }
        }
        return count;
        
    }
}
