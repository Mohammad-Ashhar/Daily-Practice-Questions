// Last updated: 31/07/2025, 21:15:07
class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length -1;
        int mid=nums.length/2;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(target<nums[mid])
            {
                right--;
                
            }
            else if(target>nums[mid])
            {
                left++;
                
            }
        }
        return -1;
        
    }
}