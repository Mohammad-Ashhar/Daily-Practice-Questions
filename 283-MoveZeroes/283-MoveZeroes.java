// Last updated: 31/07/2025, 21:17:20
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int a=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                arr[a]=nums[i];
                a++;
            }
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=arr[i];
        }
        
        
    }
}