// Last updated: 31/07/2025, 21:07:01
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
    //     if(isValid(derived,0))
    //     {
    //         return true;
    //     }
    //     if(isValid(derived,1))
    //     {
    //         return true;
    //     }
    //     return false;
        
    // }
    // public boolean isValid(int[] derived,int first)
    // {
    //     int n=derived.length;
    //     int[] original=new int[n];
    //     original[0]=first;
    //     for(int i=1;i<n;i++)
    //     {
    //         original[i]=derived[i-1]^original[i-1];
    //     }
    //     return derived[n-1]==(original[n-1]^original[0]);
    // }

    int x=0;
    for(int ele:derived)
    {
        x^=ele;
    }
    return x==0;
    }
}