// Last updated: 31/07/2025, 21:09:10
class Solution {
    public long[] sumOfThree(long num) {
        long x=num/3;
        if(x-1 + x + x+1 == num)
        {
            long[] arr={x-1,x,x+1};
            return arr;
        }
        
        return new long[0];
        
    }
}