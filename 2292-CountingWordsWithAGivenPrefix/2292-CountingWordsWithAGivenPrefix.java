// Last updated: 31/07/2025, 21:09:06
class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(String word:words)
        {
            if(word.startsWith(pref))
            {
                c++;
            }
        }
        return c;
        
    }
}