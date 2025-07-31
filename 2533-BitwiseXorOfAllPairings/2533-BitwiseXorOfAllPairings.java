// Last updated: 31/07/2025, 21:08:07
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int x1=0;
        int x2=0;
        for(int num:nums1)
        {
            x1^=num;
        }
        for(int num:nums2)
        {
            x2^=num;
        }
        int result=0;
        if(nums2.length%2!=0)
        {
            result^=x1;
        }
        if(nums1.length%2!=0)
        {
            result^=x2;
        }
        return result;
        
    }
}