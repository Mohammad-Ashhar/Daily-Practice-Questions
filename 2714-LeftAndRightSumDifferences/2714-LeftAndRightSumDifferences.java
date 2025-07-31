// Last updated: 31/07/2025, 21:07:18
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];
        int[] answer=new int[nums.length];
        int sum=0;
        for(int i=-1;i<nums.length-1;i++)
        {
            if(i==-1)
            {
                sum+=0;
            }
            else
            {
                sum+=nums[i];
            }
            leftSum[i+1]=sum;
        }
        sum=0;
        for(int i=nums.length;i>=1;i--)
        {
            if(i==nums.length)
            {
                sum+=0;
            }
            else{
                sum+=nums[i];
            }
            rightSum[i-1]=sum;
        }
        for(int i=0;i<nums.length;i++)
        {
            answer[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return answer;
    }
}