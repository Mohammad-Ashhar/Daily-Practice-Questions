class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        
        int answer1=0;
        int answer2=0;
        int freq1[]=new int[101];
        int freq2[]=new int[101];
        for(int i=0;i<nums1.length;i++)
        {
            freq1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            freq2[nums2[i]]++;
        }
        for(int i=1;i<101;i++)
        {
            if(freq1[i]>0 && freq2[i]>0)
            {
                answer1+=freq1[i];
                answer2+=freq2[i];
            }
        }
        int[] ans={answer1,answer2};
        return ans;
    }
}