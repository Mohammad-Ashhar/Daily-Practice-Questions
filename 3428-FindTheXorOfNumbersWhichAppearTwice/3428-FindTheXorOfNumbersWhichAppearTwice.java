// Last updated: 31/07/2025, 21:05:00
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int c=0;
        int result=0;
        int newarr[]=new int[50];
        int l=0;
        
        for(int i=0;i<nums.length;i++)
        {
            c=0;
           for(int j=i;j<nums.length;j++)
           {
            if (nums[i]==nums[j])
            {
                c+=1;
                if (c==2)
                {
                 newarr[l]=nums[j];
                 l+=1;
                }  
            }
           }
        }
        if (newarr.length==1)
        {
            return 1;
        }
        else
        {
            for (int k=0;k<l;k++)
            {
                result=result^newarr[k];
            }
        }

        return result;
        
    }
}