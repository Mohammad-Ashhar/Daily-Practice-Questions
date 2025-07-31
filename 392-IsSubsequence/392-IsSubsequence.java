// Last updated: 31/07/2025, 21:16:43
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        {
            return true;
        }
        char ch[]=s.toCharArray();
        int i=0;
        for(char c:t.toCharArray())
        {
            if(ch[i]==c)
            {
                if(++i==ch.length)
                {
                    return true;
                }
            }
        }
        return false;
    }
}