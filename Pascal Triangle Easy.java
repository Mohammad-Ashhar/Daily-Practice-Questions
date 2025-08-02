class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> ans = new ArrayList<>();
    for (int row = 0; row < numRows; row++) {
        ans.add(gen(row));
    }
    return ans;
}

private List<Integer> gen(int n) {
    List<Integer> answer = new ArrayList<>();
    long r = 1;
    answer.add((int) r);
    for (int k = 1; k <= n; k++) {
        r = r * (n + 1 - k) / k;
        answer.add((int) r);
    }
    return answer;
}

}