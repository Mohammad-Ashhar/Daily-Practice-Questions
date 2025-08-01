class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
            set.add(reverse(num));
        }
        return set.size();
    }
    private int reverse(int val)
    {
        int rev=0;
        while(val>0)
        {
            rev=rev*10+(val%10);
            val/=10;
        }
        return rev;
    }
}