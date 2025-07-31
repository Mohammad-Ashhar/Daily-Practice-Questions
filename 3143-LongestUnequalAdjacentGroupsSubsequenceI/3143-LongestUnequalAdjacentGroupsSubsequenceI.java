// Last updated: 31/07/2025, 21:06:27
class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String>ss=new ArrayList<>();
        ss.add(words[0]);
        int l=groups.length;
        int  ind=1;
        while(ind<l)
        {
            if(groups[ind-1]!=groups[ind])
            {
                ss.add(words[ind]);
            }
            ind+=1;
        }
        return ss;
        
    }
}