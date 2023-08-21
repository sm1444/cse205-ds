public class Q46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans , new ArrayList<>() , nums);
        return ans;
    }

    private void helper(List<List<Integer>> ans , List<Integer> temp , int[] nums) //temp stores the current permutation 
    {
        if(temp.size() == nums.length)   /*base case number of elements in the given permutation equal to the size of nums*/
        {
            ans.add(new ArrayList<>(temp));
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(temp.contains(nums[i])) continue;  //checks if the current permutation has that indexed element
                temp.add(nums[i]);
                helper(ans , temp , nums);
                temp.remove(temp.size()-1);       //removes the current permutation
            }
        }
    }
}
