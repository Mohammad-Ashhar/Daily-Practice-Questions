// Last updated: 31/07/2025, 21:13:26
class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                String temp = "";
                while (st.peek() != '(') {
                    temp += st.pop();
                }
                st.pop();
                for(int j = 0; j < temp.length(); j++) st.push(temp.charAt(j));
            } else st.push(s.charAt(i));
        }

        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }
        return ans;
    }
}