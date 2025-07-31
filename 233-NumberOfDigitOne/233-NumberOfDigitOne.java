// Last updated: 31/07/2025, 21:17:40
class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        long factor = 1; // Represents the position of the digit we're counting (1s, 10s, 100s, etc.)

        while (n >= factor) {
            long currentDigit = (n / factor) % 10; // Get the current digit
            long higherDigits = n / (factor * 10); // Get the digits higher than the current position
            long lowerDigits = n % factor; // Get the digits lower than the current position

            if (currentDigit == 0) {
                count += higherDigits * factor;
            } else if (currentDigit == 1) {
                count += higherDigits * factor + lowerDigits + 1;
            } else {
                count += (higherDigits + 1) * factor;
            }

            factor *= 10;
        }

        return count;
    }
}