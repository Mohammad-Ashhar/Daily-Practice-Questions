// Last updated: 31/07/2025, 21:18:39
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ll=new ArrayList<>();
        Arrays.sort(nums);
        printSubset(nums,ll,ans,0);
        return ans;
    }
    public static void printSubset(int[] nums,List<Integer>ll,List<List<Integer>>ans,int idx)
    {
        ans.add(new ArrayList<>(ll));
        for(int i=idx;i<nums.length;i++)
        {
            if(i>idx && nums[i]==nums[i-1])
            {
                continue;
            }
            ll.add(nums[i]);
            printSubset(nums,ll,ans,i+1);
            ll.remove(ll.size()-1);
        }
    }
}