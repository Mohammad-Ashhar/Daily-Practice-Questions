// Last updated: 31/07/2025, 21:09:07
class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long>ll=new ArrayList<>();
        if(finalSum%2!=0)
        {
            return ll;
        }
        long curr=2;
        while(finalSum>=curr)
        {
            ll.add(curr);
            finalSum-=curr;
            curr+=2;
        }
        if(finalSum>0)
        {
            ll.set(ll.size()-1,ll.get(ll.size()-1)+finalSum);
        }
        return ll;
    }
}