// Last updated: 31/07/2025, 21:14:27
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
    int l = 0, r = s.length()-1;
    while (l < r){
        if(!Character.isAlphabetic(ch[l])) 
            l++;
        else if(!Character.isAlphabetic(ch[r])) 
            r--;
        else {
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
    }
    
    return new String(ch);
    }
}