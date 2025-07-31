// Last updated: 31/07/2025, 21:07:46
class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime=new boolean[right+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for(int i=2;i*i<=right;i++)
        {
            if(isPrime[i])
            {
                for(int j=i*i;j<=right;j+=i)
                {
                    isPrime[j]=false;
                }
            }
        }
        List<Integer>ll=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isPrime[i])
            {
                ll.add(i);
            }
        }
        int[] ans={-1,-1};
        int min=Integer.MAX_VALUE;
        for(int i=1;i<ll.size();i++)
        {
            int d=ll.get(i)-ll.get(i-1);
            if(d<min)
            {
                min=d;
                ans[0]=ll.get(i-1);
                ans[1]=ll.get(i);
            }
        }
        return ans; 
    }
}