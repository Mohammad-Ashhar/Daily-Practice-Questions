// Last updated: 31/07/2025, 21:14:47
class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!='#')
            {
                sb1.append(c);
            }
            else if(sb1.length()>0)
            {
                sb1.deleteCharAt(sb1.length()-1);
            }
        }
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            if(c!='#')
            {
                sb2.append(c);
            }
            else if(sb2.length()>0)
            {
                sb2.deleteCharAt(sb2.length()-1);
            }
        }
        return sb1.toString().equals(sb2.toString());
    }
}