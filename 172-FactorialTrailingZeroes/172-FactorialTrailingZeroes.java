// Last updated: 2/2/2026, 2:18:40 PM
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;  
    }
}