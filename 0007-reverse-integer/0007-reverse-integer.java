class Solution {
    public int reverse(int x) {
        int res = 0;

        while (x != 0) {
            int lastDigit = x % 10;

            // Check for overflow/underflow
            if (res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10) {
                return 0; // Return 0 if the result overflows
            }

            res = res * 10 + lastDigit;
            x = x / 10;
        }
        return res;
    }
}
