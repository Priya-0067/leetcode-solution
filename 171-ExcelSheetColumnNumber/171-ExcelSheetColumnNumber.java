// Last updated: 2/2/2026, 2:18:50 PM
class Solution {
    public int titleToNumber(String s) {
        if (s == null) return -1;
        int sum = 0;
        for (char c : s.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }
}