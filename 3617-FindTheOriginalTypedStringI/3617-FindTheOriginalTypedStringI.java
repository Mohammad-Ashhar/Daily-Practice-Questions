// Last updated: 31/07/2025, 21:04:36
class Solution {
    public int possibleStringCount(String word) {
        int n=word.length();
        int i=0;
        int ans=1;
        while(i<n)
        {
            char c=word.charAt(i);
            int j=i+1;
            while(j<n && word.charAt(j)==c)
            {
                j++;
            }
            int len=j-i;
            if(len>=2)
            {
                ans+=(len-1);
            }
            i=j;
        }
        return ans;
        
    }
}