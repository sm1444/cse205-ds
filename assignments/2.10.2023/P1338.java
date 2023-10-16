class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int e:arr)
        {
            min = Math.min(min,e);
            max = Math.max(max,e);
        }
        int[] freq = new int[max-min+1];
        for(int e: arr)
        {
            freq[e-min]++;
        }
        Arrays.sort(freq);
        int i = max-min;
        int count = 0;
        while(n>arr.length/2)
        {
            n -= freq[i];
            i--;
            count++;
        }
        return count;
    }
}