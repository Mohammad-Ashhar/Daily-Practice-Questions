// Last updated: 31/07/2025, 21:16:56
class Solution {
    public boolean isPerfectSquare(int num) {
        double n=Math.pow(num,0.5);
        double f=Math.floor(n);
        double c=Math.ceil(n);
        double r=f-c;
        if(r==0.0)
            return true;
        return false;
        
    }
}