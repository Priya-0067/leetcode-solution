// Last updated: 2/2/2026, 2:18:27 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if ( n<=0) return false;
        if ((n & (n-1))!=0) return false;
        return (n & 0x55555555) !=0;
    }
}