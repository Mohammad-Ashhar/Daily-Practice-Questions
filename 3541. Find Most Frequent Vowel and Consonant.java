class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()) freq[ch-'a']++;
        int maxv=0,maxc=0;
        for(int i=0;i<26;i++)
        {
            if(freq[i]>0)
            {
                char ch=(char)(i+'a');
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') maxv=Math.max(maxv,freq[i]);
                else maxc=Math.max(maxc,freq[i]);
            }
        }
        return maxv+maxc;
        
    }
}