// Last updated: 31/07/2025, 21:04:21
class Solution {
    public int maxDifference(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }
        int maxOdd=Integer.MIN_VALUE;
        int mineve=Integer.MAX_VALUE;
        
        for(int val:freq)
        {
            if(val>0)
            {
                if(val%2!=0)
                {
                    maxOdd=Math.max(maxOdd,val);
                }
                else
                {
                    mineve=Math.min(mineve,val);
                }
            }
        }
        return maxOdd-mineve;
        
    }
}