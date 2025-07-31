// Last updated: 31/07/2025, 21:03:59
class Solution {
    static class Data {
        private final int[] p, r;
        Data(int n) {
            p = new int[n+1];
            r   = new int[n+1];
            for (int i = 1; i <= n; i++) 
                p[i] = i;
        }
        int fin(int x) {
            return p[x] == x ? x : (p[x] = fin(p[x]));
        }
        void uni(int a, int b) {
            a = fin(a);
            b = fin(b);
            if (a == b) 
                return;
            if (r[a] < r[b]) {
                p[a] = b;
            } 
            else if (r[b] < r[a]) {
                p[b] = a;
            } 
            else {
                p[b] = a;
                r[a]++;
            }
        }
    }

    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        Data data = new Data(c);
        for (int[] e : connections) {
            data.uni(e[0], e[1]);
        }
        TreeSet<Integer>[] os = new TreeSet[c+1];
        for (int st = 1; st <= c; st++) {
            int root = data.fin(st);
            if (os[root] == null) {
                os[root] = new TreeSet<>();
            }
            os[root].add(st);
        }
        boolean[] act = new boolean[c+1];
        Arrays.fill(act, true);
        List<Integer> ans = new ArrayList<>();
        for (int[] q : queries) {
            int type = q[0], x = q[1];
            int root = data.fin(x);
            if (type == 1) {
                if (act[x]) {
                    ans.add(x);
                } else {
                    TreeSet<Integer> ts = os[root];
                    ans.add((ts == null || ts.isEmpty()) ? -1 : ts.first());
                }
            } else {
                if (act[x]) {
                    os[root].remove(x);
                    act[x] = false;
                }
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
