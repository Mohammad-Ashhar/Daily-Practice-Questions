// Last updated: 31/07/2025, 21:18:08
class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];
       return  more_than_half(nums);
    }
    public static int more_than_half(int[] arr)
    {
        int len=arr.length;
        int v=1;
        int e=arr[0];
        for(int i=1;i<len;i++)
        {
            if(e==arr[i])
            {
                v+=1;
            }
            else
            {
                v--;
                if(v==0)
                {
                    e=arr[i];
                    v=1;
                }
            }    
        }
        return e;
    }
}