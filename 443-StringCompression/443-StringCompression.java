// Last updated: 31/07/2025, 21:16:21
class Solution {
    public int compress(char[] chars) {
        int start=0;
        int write=0;
        while(start<chars.length)
        {
            char curr=chars[start];
            int c=0;
            while(start<chars.length && chars[start]==curr)
            {
                start++;
                c++;
            }
            chars[write++]=curr;
            if(c>1)
            {
                String len=Integer.toString(c);
                for(int i=0;i<len.length();i++)
                {
                    chars[write++]=len.charAt(i);
                }
            }
        }
        return write;        
    }
}