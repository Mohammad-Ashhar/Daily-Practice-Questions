// Last updated: 31/07/2025, 21:05:24
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int clone=x;
        while(x!=0)
        {
            sum+=x%10;
            x/=10;
        }
        return (clone%sum==0)?sum:-1;
        
    }
}