// Last updated: 2/2/2026, 2:17:01 PM
class Solution {
    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2;
        int sqrt = (int)Math.sqrt(total);
        if (sqrt * sqrt == total) {
            return sqrt;
        }
        return -1;
    }
}