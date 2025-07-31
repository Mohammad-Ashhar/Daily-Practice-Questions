// Last updated: 31/07/2025, 21:20:03
class Solution {
    public int romanToInt(String s) {
        char[] c=s.toCharArray();
        int v1=0;
        int sum=0;
        int v2;
        for(int i=0;i<c.length;i++)
        {   
            v2=ValueofRoman(c[i]);
            if(v2>v1)
            {
                sum+=v2-2*v1;
            }
            else{
                sum+=v2;
            }
            v1=v2;

        }
        return sum;
    }
    private int ValueofRoman(char c)
    {
        switch(c)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:throw new IllegalArgumentException("Invalid roman numeral character:"+c);
        }
    }
}