// Last updated: 31/07/2025, 21:20:12
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] ss = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            ss[i] = new StringBuilder();
        }
        int i = 0;
        int len = s.length();
        while (i < len) {
            for (int j = 0; j < numRows && i < len; j++) {
                ss[j].append(s.charAt(i++));
            }
            for (int j = numRows - 2; j > 0 && i < len; j--) {
                ss[j].append(s.charAt(i++));
            }
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder row : ss) {
            ans.append(row);
        }
        return ans.toString();
    }
}