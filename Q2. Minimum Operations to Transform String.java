class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++)
            {
                int d=('a'-s.charAt(i)+26)%26;
                if(d>res) res=d;
            }
        return res;
        
    }
}