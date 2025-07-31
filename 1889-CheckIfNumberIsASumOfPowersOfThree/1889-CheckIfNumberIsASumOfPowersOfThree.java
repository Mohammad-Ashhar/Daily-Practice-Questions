// Last updated: 31/07/2025, 21:10:42
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n!=0)
        {
            if(n%3==2)
            {
                return false;
            }
            n/=3;
        }
        return true;
        
    }
}