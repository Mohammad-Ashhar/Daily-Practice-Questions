// Last updated: 31/07/2025, 21:04:38
class Solution {
    public char kthCharacter(long k, int[] operations) {
        return findKthChar(k, operations, operations.length, 0);
    }
    private char findKthChar(long k, int[] operations, int opIndex, int shift) {
        if (opIndex == 0) {
            return (char)('a' + (shift % 26));
        }
        long prevLength = 1L;
        for (int i = 0; i < opIndex - 1; i++) {
            if (prevLength >= k) {
                prevLength = k; 
                break;
            }
            prevLength *= 2;
        }
        int currentOp = operations[opIndex - 1];
        if (k <= prevLength) {
            return findKthChar(k, operations, opIndex - 1, shift);
        } else {
            long posInSecondHalf = k - prevLength;
            if (currentOp == 0) {
                return findKthChar(posInSecondHalf, operations, opIndex - 1, shift);
            } else {
                return findKthChar(posInSecondHalf, operations, opIndex - 1, shift + 1);
            }
        }
    }
}