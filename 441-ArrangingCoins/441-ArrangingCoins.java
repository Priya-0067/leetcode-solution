// Last updated: 2/2/2026, 2:18:12 PM
class Solution {
    public int arrangeCoins(int n) {
        int row =1;
        while(n>=row) {
            n-=row;
            row++;
        }
        return row-1;
    }
}