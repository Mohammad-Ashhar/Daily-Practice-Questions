// Last updated: 31/07/2025, 21:16:55
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
         Arrays.sort(nums);
        int n = nums.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,1);
        int hash[] = new int[n];
        int max = 1;
        int lastind = 0;
        for(int i = 0;i<=n-1;i++){
            hash[i] = i;
            for(int prev = 0;prev<i;prev++){
                if(nums[i]%nums[prev] ==0  && dp[i]<dp[prev] + 1) {
                    dp[i] = 1 + dp[prev];
                    hash[i] = prev;
                }
            }
            if(dp[i]>max){
                max = dp[i];
                lastind = i;

            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(nums[lastind]);
        while(hash[lastind] != lastind){
            lastind = hash[lastind];
            list.add(nums[lastind]);
        }
        // list.add(nums[lastind]);
        Collections.reverse(list);
        return list;

    }
}