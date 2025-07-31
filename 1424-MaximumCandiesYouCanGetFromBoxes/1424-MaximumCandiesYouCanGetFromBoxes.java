// Last updated: 31/07/2025, 21:13:01
class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int n = status.length;
        boolean[] Box = new boolean[n];
        boolean[] Key = new boolean[n];
        boolean[] opened = new boolean[n];

        Queue<Integer> queue = new LinkedList<>();
        for (int b : initialBoxes) {
            if (!Box[b]) {
                Box[b] = true;
                if (status[b] == 1) {
                    queue.offer(b);
                }
            }
        }

        int totalCandies = 0;

        while (!queue.isEmpty()) {
            int b = queue.poll();
            if (opened[b]) continue;
            if (status[b] == 0 && !Key[b]) continue;
            opened[b] = true;
            totalCandies += candies[b];
            for (int k : keys[b]) {
                if (!Key[k]) {
                    Key[k] = true;
                    if (Box[k] && !opened[k]) {
                        queue.offer(k);
                    }
                }
            }
            for (int cb : containedBoxes[b]) {
                if (!Box[cb]) {
                    Box[cb] = true;
                    if (status[cb] == 1 || Key[cb]) {
                        queue.offer(cb);
                    }
                }
            }
        }

        return totalCandies;
    }
}
