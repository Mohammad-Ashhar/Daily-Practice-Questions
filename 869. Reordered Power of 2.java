class Solution {
    public boolean reorderedPowerOf2(int n) {
        String numS=Sort(n);
        for(int i=0;i<=32;i++)
        {
            long p=(long)Math.pow(2,i);
            if(Sort(p).equals(numS))
                return true;
        }
        return false;
    }
    private String Sort(long value)
    {
        char[] arr=Long.toString(value).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}