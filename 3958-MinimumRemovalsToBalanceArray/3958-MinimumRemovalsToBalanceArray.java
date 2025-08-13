// Last updated: 13/08/2025, 11:53:03
class Solution {
    public int minRemoval(int[] nums, int k) {
        if(nums.length==1)
            return 0;
        Arrays.sort(nums);
        int max=1;
        int left=0;
        for(int right=0;right<nums.length;right++)
            {
                while(left<right && (long)nums[right]>(long)k*nums[left])
                    {
                        left++;
                    }
                max=Math.max(max,right-left+1);
            }
        return nums.length-max;
        
    }
}