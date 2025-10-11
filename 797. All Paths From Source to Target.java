class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>ll=new ArrayList<>();
        ll.add(0);
        fun(graph,0,ll,res);
        return res;
    }
    public void fun(int[][] graph,int start,List<Integer>ll,List<List<Integer>>res)
    {
        if(start==graph.length-1)
        {
            res.add(new ArrayList<>(ll));
            return;
        }
        for(int neighbour:graph[start])
        {
            ll.add(neighbour);
            fun(graph,neighbour,ll,res);
            ll.remove(ll.size()-1);
        }
    }
}