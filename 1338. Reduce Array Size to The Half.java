class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int val:arr)
        {
            if(map.containsKey(val)) map.put(val,map.get(val)+1);
            else map.put(val,1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(map.values());
        int rem=0;
        int count=0;
        while(rem<arr.length/2)
        {
            rem+=pq.poll();
            count++;
        }
        return count;
        
    }
}