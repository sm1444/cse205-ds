class Solution {
    public String customSortString(String order, String s) {
        int[] count = new int[26];
        StringBuilder res = new StringBuilder();

        for(char c:s.toCharArray())
        {
            count[c-'a']++;
        }

        for(char c:order.toCharArray())
        {
             while(count[c-'a']>0)
            {
                res.append(c);
                count[c-'a']--;
            }
        }
        for(char c='a';c<='z';c++)
        {
            while(count[c-'a']>0)
            {
                res.append(c);
                count[c-'a']--;
            }
        }
        return res.toString();
    }
}