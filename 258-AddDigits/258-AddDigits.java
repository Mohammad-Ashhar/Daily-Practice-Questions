// Last updated: 31/07/2025, 21:17:32
class Solution {
    public int addDigits(int num) {
        int sum=num;
        while(num>9)
        {
            int s=0;
            while(sum!=0)
            {       
                    int rem=sum%10;
                    s+=rem;
                    sum/=10;
            }
            num=s;
            sum=num;
        }
        return num;
    }
}