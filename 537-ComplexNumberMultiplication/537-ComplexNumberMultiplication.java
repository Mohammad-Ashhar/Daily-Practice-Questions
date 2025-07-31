// Last updated: 31/07/2025, 21:15:51
class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int r1=0,r2=0;
        for(int i=0;i<num1.length();i++)
        {
            if(num1.charAt(i)=='+')
            {
                r1=i;
                break;
            }
        }
        for(int i=0;i<num2.length();i++)
        {
            if(num2.charAt(i)=='+')
            {
                r2=i;
                break;
            }
        }
        int a=Integer.parseInt(num1.substring(0,r1));
        int b=Integer.parseInt(num1.substring(r1+1,num1.length()-1));
        int c=Integer.parseInt(num2.substring(0,r2));
        int d=Integer.parseInt(num2.substring(r2+1,num2.length()-1));
        int r=a*c-b*d;
        int ima=(b*c)+(a*d);
        String res="";
        res+=Integer.toString(r);
        res+="+";
        res+=Integer.toString(ima);
        res+="i";
        return res;
        
    }
}