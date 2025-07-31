// Last updated: 31/07/2025, 21:13:33
class Solution {
    public int tribonacci(int n) {
        int a=0,b=1,c=1,d=0;
        if(n==1||n==2)
        {
            return 1;
        }
        if(n==3)
        {
            return 2;
        }
        for(int i=3;i<=n;i++)
        {
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return d;
        
    }
}