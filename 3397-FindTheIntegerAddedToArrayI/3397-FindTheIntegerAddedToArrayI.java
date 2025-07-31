// Last updated: 31/07/2025, 21:05:16
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int ma1=0,ma2=0;
        
        for(int i=0;i<nums1.length;i++)
        {
          if(nums1[i]>ma1)
          {
            ma1=nums1[i];
          }
        }
        for(int j=0;j<nums1.length;j++)
        {
          if(nums2[j]>ma2)
          {
            ma2=nums2[j];
          }
        }
        int s=ma2-ma1;
        return s;
    }
}