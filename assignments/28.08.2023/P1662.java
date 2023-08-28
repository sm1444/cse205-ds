public class P1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String  str2 = "";
        for(int i = 0;i<word1.length;i++)
        {
             str1 = str1.concat(word1[i]);
        }
        for(int j = 0;j<word2.length;j++)
        {
             str2 = str2.concat(word2[j]);
        }
        if(str1.equals(str2))
        {
            return true;
        }else{
            return false;
        }
    }
}
