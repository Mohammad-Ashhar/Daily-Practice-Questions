// Last updated: 31/07/2025, 21:19:39
class Solution {
    public int longestValidParentheses(String s) {
        int max=0;
        int left=0,right=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                left++;
            }
            else
            {
                right++;
            }
            if(left==right)
            {
                max=Math.max(max,2*right);
            }
            else if(right>left)
            {
                left=0;
                right=0;
            }

        }
        left=0;
        right=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==')')
            {
                right++;
            }
            else
            {
                left++;
            }
            if(left==right)
            {
                max=Math.max(max,2*left);
            }
            else if(left>right)
            {
                left=0;
                right=0;
            }
        }
        return max;
        
    }
}