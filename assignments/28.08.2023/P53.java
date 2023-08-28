public class P53 {
    public int maxSubArray(int[] nums) {
        int curr_sum = nums[0];
        int max_sum = nums[0];
        for (int i=1;i<nums.length;i++)
        {
            curr_sum = Math.max(nums[i],nums[i]+curr_sum);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }
}
