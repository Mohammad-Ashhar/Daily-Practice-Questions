// Last updated: 31/07/2025, 21:08:23
class Solution {
    public int maximumSum(int[] nums) {
    //     int max=Integer.MIN_VALUE;
    //     boolean flag=false;
    //     for(int i=0;i<nums.length-1;i++)
    //     {
    //         for(int j=i+1;j<nums.length;j++)
    //         {
    //             if(SumDigit(nums[i],nums[j]))
    //             {
    //                 flag=true;
    //                 max=Math.max(max,nums[i]+nums[j]);
    //             }
    //         }
    //     }
    //     if(flag)
    //         return max;
    //     else
    //     {
    //         return -1;
    //     }

        
    // }
    // public static boolean SumDigit(int n1,int n2)
    // {
    //     int s1=0,s2=0;
    //     while(n1!=0)
    //     {
    //         int r=n1%10;
    //         s1+=r;
    //         n1/=10;
    //     }
    //     while(n2!=0)
    //     {
    //         int r=n2%10;
    //         s2+=r;
    //         n2/=10;
    //     }
    //     if(s1==s2)
    //     {
    //         return true;
    //     }
    //     return false;
    // int max=Integer.MIN_VALUE;
    // boolean flag=false;
    // int[] arr=new int[nums.length];
    // for(int i=0;i<nums.length;i++)
    // {
    //     arr[i]=SumDigit(nums[i]);
    // }
    // for(int i=0;i<nums.length-1;i++)
    // {
    //     for(int j=i+1;j<nums.length;j++)
    //     {
    //         if(arr[i]==arr[j])
    //         {
    //             max=Math.max(max,nums[i]+nums[j]);
    //             flag=true;
    //         }
    //     }
    // }
    // if(flag)
    // {
    //     return max;
    // }
    // return -1;
    // }
    // public static int SumDigit(int n)
    // {
    //     int s=0;
    //     while(n!=0)
    //     {
    //         int r=n%10;
    //         s+=r;
    //         n/=10;
    //     }
    //     return s;
    int[] arr=new int[82];
    int max = -1;
        for (int num : nums) {
            int sum = sumDigits(num);
            if (arr[sum] > 0) { 
                max = Math.max(max, arr[sum] + num);
                arr[sum] = Math.max(arr[sum], num); 
            } else {
                arr[sum] = num;
            }
        }
        return max;
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}