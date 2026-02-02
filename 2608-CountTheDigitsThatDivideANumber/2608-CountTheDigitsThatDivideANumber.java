// Last updated: 2/2/2026, 2:16:57 PM
class Solution {
    public int countDigits(int num) {
        int n = num, ans = 0;
        while (n > 0) {
            if (num % (n % 10) == 0) {
                ans++;
            }
            n /= 10;
        }
        return ans;
    }
}