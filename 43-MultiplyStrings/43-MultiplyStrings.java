// Last updated: 31/07/2025, 21:19:28
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0"))
        {
            return "0";
        }
        int l1=num1.length();
        int l2=num2.length();
        int[] result=new int[l1+l2];
        for(int i=l1-1;i>=0;i--)
        {
            for(int j=l2-1;j>=0;j--)
            {
                int multiply=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum=multiply+result[i+j+1];
                result[i+j+1]=sum%10;
                result[i+j]+=sum/10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int num:result)
        {
            if(!(sb.length()==0 && num==0))
            {
                sb.append(num);
            }
        }
        return sb.toString();
        
    }
}