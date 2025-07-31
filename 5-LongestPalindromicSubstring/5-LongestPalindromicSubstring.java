// Last updated: 31/07/2025, 21:20:14
class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1)
        {
            return s;
        }
        if(isPalindrome(s))
        {
            return s;
        }
        int max=0;
        String ans="";
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String sub=s.substring(i,j);
                if(isPalindrome(sub))
                {
                    if(max<sub.length())
                    {
                        max=sub.length();
                        ans=sub;
                    }
                }
            }
        }
        return ans;
        
    }
    public static boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}