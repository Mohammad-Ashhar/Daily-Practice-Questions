// Last updated: 31/07/2025, 21:09:19
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer>cond1=new ArrayList<>();
        List<Integer>cond2=new ArrayList<>();
        List<Integer>cond3=new ArrayList<>();
        for(int ele:nums)
        {
            if(ele<pivot)
            {
                cond1.add(ele);
            }
            else if(ele==pivot)
            {
                cond2.add(ele);
            }
            else
            {
                cond3.add(ele);
            }
        }
        cond1.addAll(cond2);
        cond1.addAll(cond3);
        int[] ans=new int[cond1.size()];
        for(int i=0;i<cond1.size();i++)
        {
            ans[i]=cond1.get(i);
        }
        return ans;
        
    }
}