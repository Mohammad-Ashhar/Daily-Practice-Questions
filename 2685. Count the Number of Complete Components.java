class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<n;i++) map.put(i,new ArrayList<>());
        for(int[] e:edges)
        {
            map.get(e[0]).add(e[1]);
            map.get(e[1]).add(e[0]);
        }
        boolean[] visited=new boolean[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(visited[i]) continue;
            Queue<Integer>q=new LinkedList<>();
            q.add(i);
            visited[i]=true;
            int r=0,dsum=0;
            while(!q.isEmpty())
            {
                int curr=q.poll();
                r++;
                dsum+=map.get(curr).size();
                for(int neighbours:map.get(curr))
                {
                    if(!visited[neighbours])
                    {
                        visited[neighbours]=true;
                        q.add(neighbours);
                    }
                }
            }
            int ec=dsum/2;
            int ee=r*(r-1)/2;
            if(ec==ee) c++;
        }
        return c;        
    }
}