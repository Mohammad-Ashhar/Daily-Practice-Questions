// Last updated: 31/07/2025, 21:03:49
class Solution {
    public boolean checkDivisibility(int n) {
        int prod=1,sum=0;
        int num=n;
        while(num!=0)
            {
                int r=num%10;
                sum+=r;
                prod*=r;
                num/=10;
            }
        return (n%(sum+prod)==0?true:false);
        
    }
}