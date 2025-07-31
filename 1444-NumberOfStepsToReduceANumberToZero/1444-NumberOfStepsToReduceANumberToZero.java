// Last updated: 31/07/2025, 21:12:54
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num!=0)
        {
            if(num%2==0)
            {
                num/=2;
                c++;
            }
            else
            {
                num--;
                c++;
            }
        }
        return c;
        
    }
}