class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        List<Set<Integer>>ll=new ArrayList<>();
        for(int i=0;i<languages.length;i++)
        {
            Set<Integer>set=new HashSet<>();
            for(int l:languages[i]) set.add(l);
            ll.add(set);
        }
        List<int[]>same=new ArrayList<>();
        for(int[] friend:friendships)
        {
            int u=friend[0]-1;
            int v=friend[1]-1;
            if(!communicate(ll.get(u),ll.get(v))) same.add(new int[]{u,v});
        }
        if(same.isEmpty()) return 0;
        int ans=Integer.MAX_VALUE;
        for(int l=1;l<=n;l++)
        {
            Set<Integer>set=new HashSet<>();
            for(int[] friend:same)
            {
                int u=friend[0];
                int v=friend[1];
                if(!ll.get(u).contains(l)) set.add(u);
                if(!ll.get(v).contains(l)) set.add(v);
            }
            ans=Math.min(ans,set.size());
        }
        return ans;
    }
    private boolean communicate(Set<Integer>a,Set<Integer>b)
    {
        for(int l:a)
        {
            if(b.contains(l)) return true;
        }
        return false;
    }
}