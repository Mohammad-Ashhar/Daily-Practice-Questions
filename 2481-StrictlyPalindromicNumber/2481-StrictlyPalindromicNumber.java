// Last updated: 31/07/2025, 21:08:17
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++)
        {
            if(!isPalindromic(Integer.toString(n,i)))
            {
                return false;
            }
        }
        return true;
        
    }
    public boolean isPalindromic(String s)
    {
        String reverse=new StringBuilder(s).reverse().toString();
        return s.equals(reverse);

    }
}