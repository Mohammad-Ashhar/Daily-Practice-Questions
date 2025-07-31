// Last updated: 31/07/2025, 21:11:24
class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
       DJS djs = new DJS(n);
        for (int[] e: edges) {
            if (e[0] == 3 && (djs.find(e[1]) != djs.find(e[2]))) djs.union(e[1], e[2]);
        }
        DJS bobsCopy = new DJS(djs);  
        int edgesUsed = djs.edges;
        for (int[] e: edges) {
            if (e[0] == 1 && (djs.find(e[1]) != djs.find(e[2]))) djs.union(e[1], e[2]);
            else if (e[0] == 2 && (bobsCopy.find(e[1]) != bobsCopy.find(e[2]))) bobsCopy.union(e[1], e[2]);
        }
        return (djs.edges == n - 1 && bobsCopy.edges == n - 1) ? edges.length - djs.edges - bobsCopy.edges + edgesUsed : -1;
    }


    public class DJS{
        int n, parent[], size[], edges;
        public DJS(int n){
            this.n = n;     
            edges = 0; 
            size = new int[n + 1];
            parent = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public DJS(DJS other){
            this.n = other.n;
            this.edges = other.edges;
            this.size = Arrays.copyOf(other.size, n + 1);
            this.parent = Arrays.copyOf(other.parent, n + 1);
        }


        public int find(int x){
            return (parent[x] == x) ? x : find(parent[x]);
        }

        public void union(int a, int b){
            edges++;
            int A = find(a), B = find(b);
            if (size[A] > size[B]) {
                int tmp = B;
                B = A;
                A = tmp;
            }
            parent[A] = B;
            size[B] += size[A];
        } 
    }
}