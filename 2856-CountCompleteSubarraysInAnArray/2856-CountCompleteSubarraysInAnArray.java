// Last updated: 31/07/2025, 21:06:49
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int n:nums)
            s.add(n);    
        int size=s.size();
        int c=0;    
        for(int i=0;i<nums.length;i++)
        {
            Set<Integer> sn=new HashSet<>();
            for(int j=i;j<nums.length;j++)
            {
                sn.add(nums[j]);
                if (sn.size() == size) {
                    c += (nums.length - j);
                    break;
                }
            }
        }
        return c;

        
    }
}