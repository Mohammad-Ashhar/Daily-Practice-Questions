// Last updated: 31/07/2025, 21:15:57
class Solution {
    public boolean detectCapitalUse(String word) {
        int cap=0,sma=0;
        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                cap++;
            }
            else if(Character.isLowerCase(word.charAt(i)))
            {
                sma++;
            }
        }
        if(cap==word.length())
        {
            return true;
        }
        else if(cap==1 && Character.isUpperCase(word.charAt(0)))
        {
            return true;
        }
        else if(sma==word.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}