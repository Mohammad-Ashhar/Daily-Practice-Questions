// Last updated: 31/07/2025, 21:16:58
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
        {
            return 1;
        }
        int unique=1;
        int total=1;
        for(int i=1;i<=n;i++)
        {
            unique*=(i==1?9:(11-i));
            total+=unique;
        }
        return total;
        
    }
}