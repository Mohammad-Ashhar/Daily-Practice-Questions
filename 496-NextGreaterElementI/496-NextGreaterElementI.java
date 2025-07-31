// Last updated: 31/07/2025, 21:16:06
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> next = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            for(int j=i+1;j<nums2.length;j++){
                if(nums2[j]>nums2[i]){
                    next.put(nums2[i],nums2[j]);
                    break;
                }
            }
        }
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i] = next.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}