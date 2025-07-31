// Last updated: 31/07/2025, 21:12:53
class Solution {
    public int maximum69Number (int num) {
        String n=Integer.toString(num);
        char arr[]=n.toCharArray();
        for(int i=0;i<n.length();i++)
        {
            if(arr[i]=='6')
            {
                arr[i]='9';
                n=String.valueOf(arr);
                return Integer.parseInt(n);
            }
        }
        n=String.valueOf(arr);
        return Integer.parseInt(n);
    }
}