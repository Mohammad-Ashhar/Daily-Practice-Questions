// Last updated: 31/07/2025, 21:05:38
class Solution {
    public int minOperations(int[] nums, int k) {
        int l=nums.length;
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]>=k)
            {
                break;
            }
            else
            {
                c++;
            }
        }
        return c;
        }
    
    }
