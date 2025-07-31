// Last updated: 31/07/2025, 21:19:59
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length<3)
        {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<nums.length-2;i++)
        {
            int lft=i+1;
            int ryt=nums.length-1;
            while(lft<ryt)
            {
                int s=nums[i]+nums[lft]+nums[ryt];
                if(s==0)
                {
                    ans.add(Arrays.asList(nums[i],nums[lft],nums[ryt]));
                    lft++;
                    ryt--;
                }
                else if(s<0)
                {
                    lft++;
                }
                else
                {
                    ryt--;
                }
            }
        }
        return new ArrayList<>(ans);        
    }
}