// Last updated: 31/07/2025, 21:11:35
class Solution {
    public String thousandSeparator(int n) {
        String num=Integer.toString(n);
        if(n<1000)
        return num;
        StringBuilder sb=new StringBuilder();int c=0;
        while(n>0){
            sb.insert(0,Integer.toString(n%10));
            c++;
            if((n/10)>0 && c%3==0)
            sb.insert(0,".");
            n/=10;
        }
        return sb.toString();
        
    }
}