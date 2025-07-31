// Last updated: 31/07/2025, 21:19:25
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);
        return result;
    }
    public static void backtrack(int[] nums, List<Integer> tempList, boolean[] used, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) continue; 
                used[i] = true;
                tempList.add(nums[i]);
                backtrack(nums, tempList, used, result);
                used[i] = false; 
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}