// Last updated: 31/07/2025, 21:05:23
class Solution {
    public int scoreOfString(String s) {
        int  su=0;
        for(int i=0;i<s.length()-1;i++)
        {
            su+=Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
        }
        return su;
        
    }
}