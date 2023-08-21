public class Q39 {
    List<List<Integer>>sol = new ArrayList<>();   //solution arrayList
   ArrayList<Integer>backtrack = new ArrayList<>();  // backtracking
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       check_sum( candidates , target , 0);  //starting from index 0
       return sol; 
    }

    public void check_sum( int[]c , int target , int start)
    {
        if(target==0)   //base case when target is zero
        {
            sol.add(new ArrayList<>(backtrack));
            return;
        }
        for(int i = start;i<c.length;i++)
        {
            if(c[i]<=target)
            {
                backtrack.add(c[i]);  //substract the indexed element from the target
                check_sum( c , target-c[i],i);
                backtrack.remove(backtrack.size()-1);
            }
        }
    }
}
