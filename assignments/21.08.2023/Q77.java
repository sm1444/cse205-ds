public class Q77
{
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        help_combine(1,n,k,new ArrayList(),result);
        return result;
    }

    void help_combine(int start , int n ,int k , List<Integer> curr , List<List<Integer>> result)
    {
        if(curr.size() == k)  //check only array with k elements are added in the list
        {
            result.add(new ArrayList(curr));
            return;
        }
        for(int i = start;i<=n;i++)
        {
            curr.add(i);
            help_combine(i+1,n,k,curr,result);
            curr.remove(curr.size()-1);
        }
    }
}