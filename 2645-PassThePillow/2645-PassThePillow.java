// Last updated: 2/2/2026, 2:16:54 PM
class Solution {
    public int passThePillow(int n, int time) {
        int num = time/(n-1);
        if(num%2==0) return time%(n-1) + 1;
        else return n - time%(n-1);
    }
}