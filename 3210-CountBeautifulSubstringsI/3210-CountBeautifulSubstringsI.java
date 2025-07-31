// Last updated: 31/07/2025, 21:06:09
class Solution {
    public int beautifulSubstrings(String s, int k) {
        int v=0,c=0,sub=0;
        for(int i=0;i<s.length()-1;i++)
        {
            v=0;
            c=0;
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')
                {
                    v++;
                }
                else
                {
                    c++;
                }
                if(v==c && (v*c %k==0))
                {
                    sub++;
                }
            }
        }
        return sub;
        
    }
}