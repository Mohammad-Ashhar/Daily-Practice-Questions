// Last updated: 31/07/2025, 21:12:02
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return ((nums[nums.length -1] - 1)  * (nums[nums.length - 2] - 1)) ;
         
    }
}