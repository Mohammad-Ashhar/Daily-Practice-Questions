// Last updated: 31/07/2025, 21:04:13
class Solution {
    public int maxSum(int[] nums) {
        int sum=0;
        int ans=Integer.MIN_VALUE;
        Set<Integer> count=new HashSet<>();
        for(int num:nums)
        {
            ans=Math.max(ans,num);            
            if(num>0 && !count.contains(num)){
                count.add(num);
                sum+=num;
                
            }
        }
        return sum > 0 ? sum : ans;
        
    }
}