// Last updated: 31/07/2025, 21:14:19
class Solution {
    public int fib(int n) {
        int a=0,b=1,c=0;
        if(n==0)
        {
            return a;
        }
        if(n==1||n==2)
        {
            return b;
        }
        if(n>2)
        
            for(int i=2;i<=n;i++)
            {
                c=a+b;
                a=b;
                b=c;
            }
            return c;
        
    }
}