class Solution {
    public boolean isTrionic(int[] nums) {
        int l = nums.length;
        if (l < 3) return false;
        int i = 0;
        while (i + 1 < l && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i < 1) return false;       
        int j = i;
        while (j + 1 < l && nums[j] > nums[j + 1]) {
            j++;
        }
        if (j == i) return false;    
        int k = j;
        while (k + 1 < l && nums[k] < nums[k + 1]) {
            k++;
        }
        if (k == j || k != l- 1) {
            return false;
        }
        return true;
    }
}