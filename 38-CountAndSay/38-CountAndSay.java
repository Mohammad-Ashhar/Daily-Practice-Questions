// Last updated: 31/07/2025, 21:19:34
class Solution {
    public String countAndSay(int n) {
        if(n==1)
        {
            return "1";
        }
        String num="1";
        for(int i=2;i<=n;i++)
        {
            String res="";
            int c=1;
            char cur=num.charAt(0);
            for(int j=1;j<num.length();j++)
            {
                if(num.charAt(j)==cur)
                {
                    c++;
                }
                else
                {
                    res+=Integer.toString(c)+cur;
                    cur=num.charAt(j);
                    c=1;
                }
            }
            res+=Integer.toString(c)+cur;
            num=res;
        }
        return num;
        
    }
}