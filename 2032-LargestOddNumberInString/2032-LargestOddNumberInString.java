// Last updated: 31/07/2025, 21:10:17
class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--)
        {
            char digit=num.charAt(i);
            if(digit=='1'|| digit=='3'|| digit=='5'|| digit=='7'||digit=='9')
            {
                return num.substring(0,i+1);
            }
        }
        return "";
        
    }
}