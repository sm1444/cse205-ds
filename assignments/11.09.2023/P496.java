public class P496{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] nxtGreater = new int[nums1.length];
        for(int j=nums2.length-1;j>=0;j--)
        {
            for(int i=nums1.length-1;i>=0;i--)
            {
                if(nums1[i]==nums2[j])
                {
                    while(!stack.isEmpty() && nums2[stack.peek()]<=nums2[j])
                    {
                        stack.pop();
                    }
                    if(stack.isEmpty())
                    {
                        nxtGreater[i] = -1;
                    }else{
                        nxtGreater[i] = nums2[stack.peek()];
                    }
                }
                stack.push(j);
            }
        }
        return nxtGreater;
    }
}