// Last updated: 31/07/2025, 21:08:33
class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer,Long>map=new HashMap<>();
        long gpair=0;
        for(int i=0;i<nums.length;i++)
        {
            int k=nums[i]-i;
            gpair+=map.getOrDefault(k,0L);
            map.put(k,map.getOrDefault(k,0L)+1);
        }
        long n=nums.length;
        return (n*(n-1)/2)-gpair; 
        
    }
}