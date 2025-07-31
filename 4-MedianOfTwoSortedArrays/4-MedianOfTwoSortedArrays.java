// Last updated: 31/07/2025, 21:20:19
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length + nums2.length;
        float[] arr=new float[l];
        int pos=0;
        for(int ele: nums1)
        {
            arr[pos++]=ele;
        }
        for(int ele:nums2)
        {
            arr[pos++]=ele;
        }
        Arrays.sort(arr);
        if(l%2!=0)
        {
            return arr[l/2];
        }
        return (arr[l/2 -1] + arr[l/2]) /2 ;
        
    }
}