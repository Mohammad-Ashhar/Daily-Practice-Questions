class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=n*n;
        int sumEven=n*(n+1);
        while (sumOdd != sumEven) {
            if (sumOdd > sumEven) {
                sumOdd -= sumEven;
            } else {
                sumEven-= sumOdd;
            }
        }
        return sumOdd;
        
    }
}