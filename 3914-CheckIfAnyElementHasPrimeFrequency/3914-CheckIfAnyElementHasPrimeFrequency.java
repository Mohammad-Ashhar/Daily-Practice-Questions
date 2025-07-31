// Last updated: 31/07/2025, 21:03:54
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++)
            {
                freq[nums[i]]+=1;
            }
        for(int f:freq)
            {
            if(Prime(f))
            {
            return true;
            }
            }
    return false;
    }
    private boolean Prime(int num) {
        if (num <= 1)
            return false;           
        if (num <= 3) 
            return true;            
        if (num % 2 == 0) 
            return false;       
        int lim = (int) Math.sqrt(num);
        for (int i = 3; i <= lim; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}