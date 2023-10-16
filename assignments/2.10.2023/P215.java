class Solution {
    public int findKthLargest(int[] nums, int k) {
        mergesort(nums,0,nums.length-1);
       return nums[nums.length - k];
    }
     public static void conquer (int arr[], int si ,int mid, int ei)
    {
        int merge[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei)
        {
            if(arr[idx1]<=arr[idx2])
            {
                merge[x++] = arr[idx1++];
            }else{
                merge[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid)
        {
            merge[x++] = arr[idx1++];
        }
        while(idx2<=ei)
        {
            merge[x++] = arr[idx2++];
        }

        for(int i=0 ,j =si;i<merge.length;i++ , j++)
        {
            arr[j] = merge[i];
        }
    }
    public static void mergesort(int arr[], int si , int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid = si + (ei-si)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
}
