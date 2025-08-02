class Solution {
    public int[] closestDivisors(int num) {
        int[] div1=divisors(num+1);
        int[] div2=divisors(num+2);
        int diff1=Math.abs(div1[0]-div1[1]);
        int diff2=Math.abs(div2[0]-div2[1]);
        return diff1<=diff2?div1:div2;
    }
    private int[] divisors(int val)
    {
        int sqrt=(int)Math.sqrt(val);
        int[] arr=new int[2];
        for(int i=sqrt;i>=1;i--)
        {
            if(val%i==0)
            {
                arr[0]=i;
                arr[1]=val/i;
                return arr;
            }
        }
        arr[0]=1;
        arr[1]=val;
        return arr;
    }
}