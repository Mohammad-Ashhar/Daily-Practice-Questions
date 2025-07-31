// Last updated: 31/07/2025, 21:19:32
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ll=new ArrayList<>();
        CoinCombination(candidates,target,ll,ans,0);
        return ans;
    }
    public static void CoinCombination(int[] coin,int amount,List<Integer>ll,List<List<Integer>>ans,int idx)
    {
        if(amount==0)
        {
            ans.add(new ArrayList<>(ll));// for copying the list
            return;
        }
        for(int i=idx;i<coin.length;i++)
        {
            if(amount>=coin[i])
            {
                ll.add(coin[i]);
                CoinCombination(coin,amount-coin[i],ll,ans,i);
                ll.remove(ll.size() - 1);
            }
        }
    }
}