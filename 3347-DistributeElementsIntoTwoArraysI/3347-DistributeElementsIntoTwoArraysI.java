// Last updated: 31/07/2025, 21:05:28
class Solution {
    public int[] resultArray(int[] nums) {
       int l=nums.length;
       int arr1[] = new int[50];
       int arr2[]= new int[50];
       int newarr[]=new int[l];
       int a=0,b=0;
       for(int i=0;i<l-1;i++)
       {
        if(i==0)
        {
            arr1[a]=nums[0];
            arr2[b]=nums[i+1];
            a++;
            b++;
        }
        else if(arr1[a-1]>arr2[b-1])
        {
            arr1[a]=nums[i+1];
            a++;
        }
        else if(arr1[a-1]<arr2[b-1])
        {
            arr2[b]=nums[i+1];
            b++;
        }
       }
       for(int j=0;j<a;j++)
       {
        newarr[j]=arr1[j];
       }
       int c=0;
       for(int k=a;k<l;k++)
       {
        newarr[k]=arr2[c++];
       }
       return newarr;
       
        
    }
}