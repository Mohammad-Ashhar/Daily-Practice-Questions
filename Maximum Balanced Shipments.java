class Solution {
    public int maxBalancedShipments(int[] weight) {
        Stack<Integer>st=new Stack<>();
        int answer=0;
        for(int w:weight)
            {
                if(st.isEmpty())
                {
                    st.push(w);
                }
                else if(w<st.peek())
                {
                  answer++;
                    st.clear();
                }
                else
                {
                    while(!st.isEmpty() && st.peek()<=w)
                        st.pop();
                    st.push(w);
                }
            }
        return answer;
    }
}©leetcode