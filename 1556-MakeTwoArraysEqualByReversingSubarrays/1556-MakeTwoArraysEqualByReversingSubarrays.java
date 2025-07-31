// Last updated: 31/07/2025, 21:12:11
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int l1=target.length,l2=arr.length;
        if(l1!=l2)
            return false;
        int  newarr[]=new int[1001];
        for(int i=0;i<l1;i++)
        {
            newarr[target[i]]++;
            newarr[arr[i]]--;
        }
        for(int i=0;i<l1;i++)
        {
            if(newarr[target[i]]!=0||newarr[arr[i]]!=0)
                return false;
        }
        return true;   
    }
}