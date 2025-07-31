// Last updated: 31/07/2025, 21:04:53
class Solution {
    public int numberOfChild(int n, int k) {
        int a=n-1;
        int l=k%a;
        int r=k/a;
        return r%2==0?l:(n-1-l);
    }
}