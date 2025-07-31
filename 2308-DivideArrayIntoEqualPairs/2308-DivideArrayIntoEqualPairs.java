// Last updated: 31/07/2025, 21:08:59
class Solution {
    public boolean divideArray(int[] nums) {
        int[] arr=new int[501];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }
        for(int i=1;i<501;i++)
        {
            if(arr[i]%2==1)
            {
                return false;
            }
        }
        return true;
    }
}