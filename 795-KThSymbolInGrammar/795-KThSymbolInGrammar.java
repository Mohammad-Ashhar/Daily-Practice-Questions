// Last updated: 31/07/2025, 21:15:06
class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1)
        {
            return 0;
        }
        int p=kthGrammar(n-1,(k+1)/2);
        boolean isTrue=(k%2==0);
        return isTrue?1-p:p;
        

    }
}