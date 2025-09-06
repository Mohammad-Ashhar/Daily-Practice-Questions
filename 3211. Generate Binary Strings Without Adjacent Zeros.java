class Solution {
    public List<String> validStrings(int n) {
        List<String>ll=new ArrayList<>();
        backtrack(n,"",ll);
        return ll;        
    }
    private void backtrack(int n,String curr,List<String>ll) {
        if (curr.length() == n) {
            ll.add(curr);
            return;
        }
        backtrack(n,curr+"1",ll);
        if (curr.isEmpty()||curr.charAt(curr.length()-1)!='0') {
            backtrack(n,curr+"0",ll);
        }
    }
}