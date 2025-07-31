// Last updated: 31/07/2025, 21:04:30
class Solution {
    public int countSubarrays(int[] nums) {
        int c=0;
        int[] arr=new int[3];
        for(int i=0;i<nums.length-2;i++)
        {
            int k=0;
            for(int j=i;j<i+3;j++)
            {
                arr[k++]=nums[j];
            }
            if((float)(arr[0]+arr[2])==(float)arr[1]/2)
            {
                c++;
            }
            
        }
        return c;
        
    }
}