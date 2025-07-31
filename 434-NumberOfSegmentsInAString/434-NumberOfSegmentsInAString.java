// Last updated: 31/07/2025, 21:16:29
class Solution {
    public int countSegments(String s) {
        int c=0;
        boolean b=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                if(!b)
                {
                    c++;
                    b=true;
                }
                
            }
            else{
                    b=false;
                }
        }
        return c;
    }
}