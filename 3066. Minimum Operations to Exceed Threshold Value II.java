class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long>pq=new PriorityQueue<>();
        for(int n:nums) pq.add((long)n);
        int ops=0;
        while(pq.peek()<k)
        {
            long min1=pq.poll();
            long min2=pq.poll();
            pq.add(min1*2 + min2);
            ops++;
        }
        return ops;
    }
}