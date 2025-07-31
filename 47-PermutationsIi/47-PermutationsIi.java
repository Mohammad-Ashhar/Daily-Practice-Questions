// Last updated: 31/07/2025, 21:19:23
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        backtrack(res,temp,nums,used);
        return res;
    }
    public void backtrack(List<List<Integer>>res,ArrayList<Integer>temp,int[] nums,boolean[] used)
    {
        if(temp.size()==nums.length &&!res.contains(temp))
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i])
            {
                continue;
            }
            used[i]=true;
            temp.add(nums[i]);
            backtrack(res,temp,nums,used);
            used[i]=false;
            temp.remove(temp.size()-1);
        }
    }
}