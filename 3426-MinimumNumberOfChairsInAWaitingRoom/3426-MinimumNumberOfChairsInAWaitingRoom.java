// Last updated: 31/07/2025, 21:05:04
class Solution {
    public int minimumChairs(String s) {
        int a[]=new int[50];
        int c=0,b=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='E')
            {
                c+=1;
                a[b]=c;
                b+=1;
            }
            else if(s.charAt(i)=='L')
            {
                if(c>0)
                {
                    c-=1;
                    a[b]=c;
                    b+=1;
                }
            }
            
        }
        int ma=a[0];
        for(int i=1;i<s.length();i++)
        {
            if(ma<a[i])
            {
                ma=a[i];
            }
        }
        return ma;
                
    }
}