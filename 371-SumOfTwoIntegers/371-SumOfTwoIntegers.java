// Last updated: 31/07/2025, 21:16:53
class Solution {
    public int getSum(int a, int b) {
        int x,y;
        do
        {
            x=a & b;
            y=a ^ b;
            a=x<<1;
            b=y;
        }while(x!=0);
        return y;
    }
}