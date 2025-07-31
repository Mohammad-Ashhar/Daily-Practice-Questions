// Last updated: 31/07/2025, 21:12:19
class Solution {
    public int maxScore(String s) {
        String left="",right="";
        int a=1,max=0;
        while(a<s.length())
        {
            left=s.substring(0,a);
            right=s.substring(a);
            int l=left.length();
            int r=right.length();
            int zero=0,one=0;
            while(l!=0)
            {
                if(left.charAt(l-1)=='0')
                {
                    zero+=1;
                }
                l--;
            }
            while(r!=0)
            {
                if(right.charAt(r-1)=='1')
                {
                    one+=1;
                }
                r--;
            }
            max=Math.max(max,zero+one);
            a++;
        }
        return max;
        
    }
}