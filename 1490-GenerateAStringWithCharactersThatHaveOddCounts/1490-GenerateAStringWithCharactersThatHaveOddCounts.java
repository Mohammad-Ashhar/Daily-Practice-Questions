// Last updated: 31/07/2025, 21:12:36
class Solution {
    public String generateTheString(int n) {
        char arr[]=new char[n];
        if(n%2==0)
        {
            for(int i=0;i<n-1;i++)
            {
                arr[i]='a';
            }
            arr[n-1]='b';
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                arr[i]='a';
            }
        }
        return new String(arr);
        
    }
}