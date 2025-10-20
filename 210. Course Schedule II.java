class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<numCourses;i++)
        {
            map.put(i,new ArrayList<>());
        }
        int[] indegree=new int[numCourses];
        for(int[] pre:prerequisites)
        {
            map.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0) q.add(i);
        }
        int[] ord=new int[numCourses];
        int idx=0;
        while(!q.isEmpty())
        {
            int cur=q.poll();
            ord[idx++]=cur;
            for(int neighbour:map.get(cur))
            {
                indegree[neighbour]--;
                if(indegree[neighbour]==0)q.add(neighbour);
            }
        }
        if(idx!=numCourses) return new int[0];
        return ord;
        
    }
}