// Last updated: 31/07/2025, 21:15:28
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(String ops:operations)
        {
            if(ops.equals("C"))
            {
                st.pop();
            }
            else if(ops.equals("D"))
            {
                st.push(2*st.peek());
            }
            else if(ops.equals("+"))
            {
                int top=st.pop();
                int newtop=top+st.peek();
                st.push(top);
                st.push(newtop);
            }
            else
            {
                st.push(Integer.parseInt(ops));
            }
        }
        int sum=0;
        for(int ele:st)
        {
            sum+=ele;
        }
        return sum;
        
    }
}