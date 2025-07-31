// Last updated: 31/07/2025, 21:13:25
class Solution {
    public String makeFancyString(String s) {
        int count=0;
        char prev=0;
        StringBuilder ans=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(prev==ch)
            {
                count++;
            }
            else
            {
                prev=ch;
                count=1;

            }
            if(count<3)
            {
                ans.append(ch);
            }
        }
        return ans.toString();
        
    }
}