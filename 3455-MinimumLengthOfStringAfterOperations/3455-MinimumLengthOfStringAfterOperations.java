// Last updated: 31/07/2025, 21:04:50
class Solution {
    public int minimumLength(String s) {
        int[] freq=new int[26];
        int ans=0;
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            int val=freq[i];
            while(val>=3)
            {
                val-=2;
            }
            ans+=val;
        }
        return ans;
        
    }
}