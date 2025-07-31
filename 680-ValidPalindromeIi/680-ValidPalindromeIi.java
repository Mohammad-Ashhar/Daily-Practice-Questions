// Last updated: 31/07/2025, 21:15:30
class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
   int right=s.length()-1;
   while(left<right){
    if(s.charAt(right)==s.charAt(left)){
        left++;
        right--;
    }
    else{
        return isValid(s,left+1,right) ||isValid(s,left,right-1);
    }
   }
   return true;
}
   boolean isValid(String s,int left,int right){
    while(left<right){
         if(s.charAt(right)==s.charAt(left)){
        left++;
        right--;;
    }
    else
        return false;
    
    }
    return true;
   }
}