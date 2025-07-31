// Last updated: 31/07/2025, 21:15:36
class Solution {
    public int countSubstrings(String s) {
        return Count_Palindromic(s);
    }
    public static int Count_Palindromic(String s)
    {
        int odd=0;
        // odd length palindromic
        for(int axis=0;axis<s.length();axis++)
        {
            for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++)
            {
                if(s.charAt(axis-orbit)!=s.charAt(axis+orbit))
                {
                    break;
                }
                odd++;
            }
        }
        int even =0;
        // even length palindromic
        for(int axis=0;axis<s.length()-1;axis++)
        {
            for(int orbit=0;axis-orbit>=0 && axis+1+orbit<s.length();orbit++)
            {
                if(s.charAt(axis-orbit)!=s.charAt(axis+1+orbit))
                {
                    break;
                }
                even++;
            }
        }
        return odd+even;   
    }
}