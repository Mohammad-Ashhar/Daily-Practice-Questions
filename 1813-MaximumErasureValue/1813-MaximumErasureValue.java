// Last updated: 31/07/2025, 21:10:56
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left=0;
        long max=0,curr=0;;
        boolean[] used=new boolean[10001];
        for(int right=0;right<nums.length;right++)
        {
            while(used[nums[right]])
            {
                used[nums[left]]=false;
                curr-=nums[left];
                left++;
            }
            used[nums[right]]=true;
            curr+=nums[right];
            if(curr>max)
            {
                max=curr;
            }
        }
        return (int)max;
        
    }
}