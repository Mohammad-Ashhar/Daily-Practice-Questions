// Last updated: 31/07/2025, 21:04:22
class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        Map<Integer, List<Integer>> value = new HashMap<>();
        for (int i = 0; i < n; i++) {
            value.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        List<Integer> ans = new ArrayList<>();
        for (int q : queries) {
            int target = nums[q];
            List<Integer> ind = value.get(target);
            if (ind.size() <= 1) {
                ans.add(-1);
                continue;
            }
            int pos = Collections.binarySearch(ind, q);
            int size = ind.size();
            int leftIdx = ind.get((pos - 1 + size) % size);
            int rightIdx = ind.get((pos + 1) % size);
            int diffLeft = Math.abs(q - leftIdx);
            int circularDiffLeft = Math.min(diffLeft, n - diffLeft);
            
            int diffRight = Math.abs(q - rightIdx);
            int circularDiffRight = Math.min(diffRight, n - diffRight);
            
            int minDistance = Math.min(circularDiffLeft, circularDiffRight);
            ans.add(minDistance);
        }
        return ans;
        }
    }