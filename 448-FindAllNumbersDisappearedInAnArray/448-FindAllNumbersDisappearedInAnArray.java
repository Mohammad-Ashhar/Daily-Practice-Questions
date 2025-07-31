// Last updated: 31/07/2025, 21:16:19
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> numbers = new ArrayList<>();
        List<Integer> notContain = new ArrayList<>();
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index]; 
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                notContain.add(i + 1);
            }
        }
        
        return notContain;
    }
}
