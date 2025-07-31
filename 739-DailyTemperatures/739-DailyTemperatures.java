// Last updated: 31/07/2025, 21:15:17
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] answer=new int[n];
        Stack<Integer>index=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!index.isEmpty() && temperatures[i]>temperatures[index.peek()])
            {
                int previous=index.pop();
                answer[previous]=i-previous;
            }
            index.push(i);
        }
        return answer;

        
    }
}