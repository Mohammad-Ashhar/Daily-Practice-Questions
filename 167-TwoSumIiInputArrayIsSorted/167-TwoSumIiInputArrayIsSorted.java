// Last updated: 31/07/2025, 21:18:06
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];
        int left=0;
        int right=numbers.length-1;
        while(left<=right)
        {
            int mid=numbers[left] + numbers[right];
            if(mid==target)
            {
                arr[0]=left+1;
                arr[1]=right+1;
                return arr;
            }
            else if(mid<target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return arr;
        
    }
}