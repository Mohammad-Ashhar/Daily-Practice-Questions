// Last updated: 31/07/2025, 21:12:49
class Solution {
    public int numberOfSubstrings(String s) {
        int[] c={0,0,0};
        int count=0,left=0;
        for(int i=0;i<s.length();i++)
        {
            c[s.charAt(i)-'a']++;
            while(c[0]>0 && c[1]>0 && c[2]>0)
            {
                count+=s.length()-i;
                c[s.charAt(left)-'a']--;
                left++;
            }
        }
        return count; 
        
    }
}