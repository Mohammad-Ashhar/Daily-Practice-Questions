// Last updated: 31/07/2025, 21:18:13
class Solution {
    public int findMin(int[] nums) {
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++)
        // {
        //     min=Math.min(min,nums[i]);
        // }
        // return min;
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            int mid=left + (right -left )/2;
            if(nums[mid]>nums[right])
            {
                left=mid+1;
            }
            else
            {
                right=mid;

            }
        }
        return nums[left];

        
    }
}