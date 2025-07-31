// Last updated: 31/07/2025, 21:04:35
class Solution {
    public int minOperations(int[] nums, int k) {
        for(int num:nums)
        {
            if(num<k)
            {
                return -1;
            }
        }
        Set<Integer>set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int c=0;
        for(int ele:set)
        {
            if(ele>k)
            {
                c++;
            }
        }
        return c;
        
    }
}