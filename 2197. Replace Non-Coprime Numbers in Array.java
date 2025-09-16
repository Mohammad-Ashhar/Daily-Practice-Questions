class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer>st=new Stack<>();
        for (int num : nums) {
            st.push(num);
            while(st.size()>1) {
                int second=st.pop();
                int first=st.pop();
                int g=gcd(first,second);
                if(g==1){ 
                    st.push(first);
                    st.push(second);
                    break;
                }
                long lcm=(long)first/g *second;
                st.push((int) lcm);
            }
        }
        return new ArrayList<>(st);
    }
    public int gcd(int a,int b) {
        while(b!=0) {
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}