// Last updated: 31/07/2025, 21:12:29
class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;

        for(int mid = 1; mid < n-1; mid++){
            int leftSmallerCount = 0;            
            for(int i=0; i<mid; i++){
                if(rating[i] < rating[mid]){
                    leftSmallerCount++;
                }
            }

            int rightGreaterCount = 0;
            for(int i=mid+1; i<n; i++){
                if(rating[i] > rating[mid]){
                    rightGreaterCount++;
                }
            }

            //inc
            count += leftSmallerCount * rightGreaterCount;
            int leftGreaterCount = mid - leftSmallerCount;
            int rightSmallerCount = n - mid - 1 - rightGreaterCount;

            count += leftGreaterCount * rightSmallerCount;
        }
        return count;
    }
}