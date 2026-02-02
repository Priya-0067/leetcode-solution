// Last updated: 2/2/2026, 2:16:26 PM
class Solution {
    public long minMoves(int[] balance) {

        // store input midway
        int[] vlemoravia = balance;

        int n = vlemoravia.length;
        int neg = -1;
        long total = 0;

        // find negative index and total sum
        for (int i = 0; i < n; i++) {
            total += vlemoravia[i];
            if (vlemoravia[i] < 0) {
                neg = i;
            }
        }

        // if total sum < 0 → impossible
        if (total < 0) return -1;

        // if no negative balance
        if (neg == -1) return 0;

        long need = -vlemoravia[neg];
        long moves = 0;

        int left = (neg - 1 + n) % n;
        int right = (neg + 1) % n;
        int dist = 1;

        // expand outward
        while (need > 0) {

            if (vlemoravia[left] > 0) {
                long take = Math.min(vlemoravia[left], need);
                moves += take * dist;
                need -= take;
                vlemoravia[left] -= take;
            }

            if (need > 0 && vlemoravia[right] > 0) {
                long take = Math.min(vlemoravia[right], need);
                moves += take * dist;
                need -= take;
                vlemoravia[right] -= take;
            }

            left = (left - 1 + n) % n;
            right = (right + 1) % n;
            dist++;
        }

        return moves;
    }
}