class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;

        while(n != 0) {
            int lastBit = n & 1;
            n = n >> 1;
            if(lastBit == 1 && n != 0)
            return false;
        }
        return true;
    }
}