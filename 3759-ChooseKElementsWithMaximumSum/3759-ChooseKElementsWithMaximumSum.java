// Last updated: 31/07/2025, 21:04:20
class Solution {
    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        long[] result = new long[n];
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }
        Arrays.sort(idx, (i, j) -> Integer.compare(nums1[i], nums1[j]));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long heapSum = 0;
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && nums1[idx[i]] == nums1[idx[j]]) {
                j++;
            }
            for (int p = i; p < j; p++) {
                result[idx[p]] = heapSum;
            }
            for (int p = i; p < j; p++) {
                int curVal = nums2[idx[p]];
                if (minHeap.size() < k) {
                    minHeap.offer(curVal);
                    heapSum += curVal;
                } else if (minHeap.peek() < curVal) {
                    heapSum -= minHeap.poll();
                    minHeap.offer(curVal);
                    heapSum += curVal;
                }
            }
            i = j;
        }
        return result;
    }
}
