// Last updated: 31/07/2025, 21:15:43
class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int longest = 0;
        for (int num : countMap.keySet()) {
            if (countMap.containsKey(num + 1)) {
                longest = Math.max(longest, countMap.get(num) + countMap.get(num + 1));
            }
        }
        
        return longest;
        
    }
}