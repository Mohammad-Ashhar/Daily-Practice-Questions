// Last updated: 31/07/2025, 21:13:51
class Solution {
    public String removeDuplicates1(String s){
        char[] chars = s.toCharArray();
        int slow = 0;
        int fast = 0;
        while(fast < chars.length){
            if(slow > 0 && chars[slow - 1] == chars[fast]){
                slow--;
            } else {
                chars[slow] = chars[fast];
                slow++;
            }
            fast++;
        }
        return new String(chars, 0, slow);
    }

    public String removeDuplicates(String s) {
        char[] st = s.toCharArray();
        int top = -1;
        for (char c : st) {
            if (top >= 0 && st[top] == c) {
                top--;
            }
            else {
                st[++top] = c;
            }
        }
        return new String(st, 0, top + 1);
    }
}