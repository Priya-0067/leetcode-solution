// Last updated: 2/2/2026, 2:16:40 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0, n = x;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (x % sum == 0) {
            return sum;
        }
        return -1;
    }
}