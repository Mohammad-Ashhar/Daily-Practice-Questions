// Last updated: 31/07/2025, 21:17:47
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ll=new ArrayList<>();
        printCombinations(k,n,1,ll,ans,0);
        return ans;
    }
    public static void printCombinations(int k,int n,int idx,List<Integer>ll, List<List<Integer>>ans,int sum)
    {
        if(ll.size()==k)
        {
            if(sum==n)
            {
                ans.add(new ArrayList<>(ll));
                return ;
            }
            else
            {
                return;
            }
        }
        for(int i=idx;i<=9;i++)
        {
            ll.add(i);
            sum+=i;
            printCombinations(k,n,i+1,ll,ans,sum);
            ll.remove(ll.size()-1);
            sum-=i;
        }
    }
}