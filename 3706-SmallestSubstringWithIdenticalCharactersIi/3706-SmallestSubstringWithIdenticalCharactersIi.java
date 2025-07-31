// Last updated: 31/07/2025, 21:04:28
class Solution {
    public int minLength(String s, int numOps) {
        int l=1;
      int e=s.length();
      int ans=0;
      while(l<=e){
        int m=(l+e)/2;
        if(f(m,numOps,s)){
            ans=m;
            e=m-1;
        }
        else l=m+1;
      }  
      return ans;
    }
    public boolean f(int m,int n,String s){
        if(m==1){
            return ff(s,n,'0')||ff(s,n,'1');
        }
        int c=1;
        int f=s.charAt(0)-'0';
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                n-=(c)/(m+1);
                c=1;
            }
        }
        n-=(c)/(m+1);
        return n>=0;

    }
    public boolean ff(String s,int n,char ch){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                
            }
            else n--;
            ch=ch=='1'?'0':'1';
        }
        return n>=0;  
    }
}