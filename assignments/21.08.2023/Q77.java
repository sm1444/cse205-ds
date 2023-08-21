public class Q77
{
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combine_use(result, new ArrayList<>(),1,n,k);  //n range of numbers  k-->number of elements in each combination
        return result;
    }

    public void combine_use(List<List<Integer>> result, List<Integer> current , int index , int n , int k)
    {
        if(k==0)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        if(index>n)
        {
            return;
        }
        current.add(index);
        combine_use(result , current , index+1,n,k-1);
        current.remove(current.size()-1);   //backtrack
        combine_use(result , current , index+1,n,k);
    }
}