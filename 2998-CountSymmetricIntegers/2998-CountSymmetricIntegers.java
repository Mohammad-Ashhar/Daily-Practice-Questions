// Last updated: 31/07/2025, 21:06:37
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++)
        {
            String num=Integer.toString(i);
            int l=num.length();
            if(l%2!=0)
            {
                continue;
            }
            int first=l/2;
            int s1=0,s2=0;
            for(int j=0;j<first;j++)
            {
                s1+=num.charAt(j)-'0';
            }
            for(int j=first;j<l;j++)
            {
                s2+=num.charAt(j)-'0';
            }
            if(s1==s2)
            {
                c++;
            }
        }
        return c;
        
    }
}