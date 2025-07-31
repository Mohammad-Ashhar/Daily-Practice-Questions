// Last updated: 31/07/2025, 21:17:57
class Solution {
    public int numSquare(int n)
    {
        int num=0;
        while(n!=0)
        {
            int r=n%10;
            num+=r*r;
            n/=10;
        }
        return num;
    }
    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();
        while(true)
        {
            n=numSquare(n);
            if(n==1)
            {
                return true;
            }
            if(set.contains(n))
            {
                return false;
            }
            set.add(n);
        }
        
    }
}