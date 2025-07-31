// Last updated: 31/07/2025, 21:12:33
class Solution {
    public boolean canConstruct(String s, int k) {
        if(k>s.length())
        {
            return false;
        }
        int[] freq=new int[26];
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }
        int oddfreq=0;
        for(int count:freq)
        {
            if(count%2!=0)
            {
                oddfreq++;
            }
        }
        return oddfreq<=k;

        
    }
}