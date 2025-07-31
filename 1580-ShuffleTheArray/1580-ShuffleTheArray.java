// Last updated: 31/07/2025, 21:11:59
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[n*2];
        int a=0;
        for(int i=0;i<n;i++)
        {
            arr[a++]=nums[i];
            arr[a++]=nums[n+i];
        }
        for(int i=0;i<n*2;i++)
        {
            nums[i]=arr[i];
        }
        return nums;
    }
}