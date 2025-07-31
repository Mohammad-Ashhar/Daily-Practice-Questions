// Last updated: 31/07/2025, 21:12:18
class Solution {
    public int maxPower(String s) {
        int max=0,c=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                c++;
                if(c>max)
                {
                    max=c;
                }
            }
            else
            {
                c=0;
            }
        }
        return max+1;

        
    }
}