// Last updated: 31/07/2025, 21:17:21
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
        int r=n;
       
        while(l<r){
         int mid=l+(r-l)/2;
         if(isBadVersion(mid)){
             r=mid;
         }else{
          l=mid+1;
         }
        }
        
        return l;
        // int lo=1;
        // int hi=n;
        // int ans=0;
        // while(lo<=hi)
        // {
        //     int mid=(lo+hi)/2;
        //     if(isBadVersion(mid))
        //     {
        //         ans=mid;
        //         hi=mid-1;
        //     }
        //     else
        //     {
        //         lo=mid+1;
        //     }
        // }
        // return ans;
    }
}