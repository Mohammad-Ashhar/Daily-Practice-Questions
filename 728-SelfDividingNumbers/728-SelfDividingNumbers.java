// Last updated: 31/07/2025, 21:15:18
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       List<Integer> l = new ArrayList<>();

        for(int i=left; i<=right; i++){
            if(selfDivide(i)){
                l.add(i);
            }
        }
        return l;
    }

    private boolean selfDivide(int num){
        int n = num;
        while(num > 0){
            int rem = num%10;
            if(rem == 0 || n%rem != 0){
                return false;
            }
            num/=10;
        }
        return true;
        
    }
}