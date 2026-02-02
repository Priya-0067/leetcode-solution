// Last updated: 2/2/2026, 2:18:32 PM
class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        return 1 + (num - 1) % 9;


    }
}