// Last updated: 31/07/2025, 21:05:09
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer>occur=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==x)
            {
                occur.add(i);
            }
        }
        int[] newarr=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int findoccur=queries[i]-1;
            if(findoccur<occur.size())
            {
                newarr[i]=occur.get(findoccur);
            }
            else
            {
                newarr[i]=-1;
            }
        }
        return newarr;
        
    }
}