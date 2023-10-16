class Solution {
    public String frequencySort(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(char c: s.toCharArray())
        {
            max = Math.max(max,c);
            min = Math.min(min,c);
        }
        int[] freq = new int[max-min+1];
        for(char c:s.toCharArray())
        {
            freq[c-min]++;
        }
        List<Character> res = new ArrayList<>();
        for(int c=min; c<=max;c++)
        {
            if(freq[c-min]>0)
            {
                res.add((char)c);
            }
        }
        int[] f = freq;
        int m = min;
        res.sort((a,b)->Integer.compare(f[b-m],f[a-m]));
        char[] ans = new char[s.length()];
        int idx = 0;
        for(char c: res)
        {
            int frequency = freq[c-min];
            for(int i=0;i<frequency;i++)
            {
                ans[idx++] = c;
            }
        }
        return new String(ans);
    }
}
