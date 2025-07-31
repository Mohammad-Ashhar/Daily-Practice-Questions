// Last updated: 31/07/2025, 21:08:57
class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        if(n<3)
        {
            return 0;
        }
        List<Integer>ll=new ArrayList<>();
        ll.add(nums[0]);
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                ll.add(nums[i]);
            }
        }
        int ans=0;
        for(int i=1;i+1<ll.size();i++)
        {
            int prev=ll.get(i-1);
            int curr=ll.get(i);
            int next=ll.get(i+1);
            if(curr>prev && curr>next)
            {
                ans++;
            }
            else if(curr<prev && curr<next)
            {
                ans++;
            }
        }
        return ans;
        
    }
}