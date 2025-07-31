// Last updated: 31/07/2025, 21:20:10
class Solution {
    public int myAtoi(String s) {
        if (s == null) return 0;
        s = s.trim();
        if (s.length() == 0)             
            return 0;
        int sign = 1, i = 0, n = s.length();
        long ans = 0;
        char first = s.charAt(0);
        if (first == '+' || first == '-') {
            sign = (first == '-') ? -1 : 1;
            i++;
        }
        while (i < n) {
            char dig = s.charAt(i);
            if (!Character.isDigit(dig))  
                break;
            ans = ans * 10 + (dig - '0');
            if (sign == 1 && ans > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && -ans < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }

        return (int)(sign * ans);
    }
}
