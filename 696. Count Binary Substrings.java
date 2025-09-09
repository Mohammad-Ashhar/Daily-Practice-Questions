class Solution {
    public int countBinarySubstrings(String s) {
        int prev=0,curr=1,c=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)==s.charAt(i)) curr++;
            else {
                c+=Math.min(prev,curr);
                prev=curr;
                curr=1;
            }
        }
        c+=Math.min(prev,curr);
        return c;

        
    }
}