// Last updated: 31/07/2025, 21:18:17
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        System.out.println(s);
        String[] arr = s.split("\s+");
        String ans = "";
        for(int i = arr.length-1; i >= 0; i-- ){
            ans = ans + arr[i] + " ";
        }
        return ans.trim();
    }
}