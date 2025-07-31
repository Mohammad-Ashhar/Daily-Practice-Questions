// Last updated: 31/07/2025, 21:10:30
class Solution {
    public int findTheWinner(int n, int k) {
        int ind=0;
        for(int i=2;i<=n;i++)
        {
            ind=(ind+k)%i;
        }
        return ind+1;
    }
}