// Last updated: 2/2/2026, 2:16:39 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (num % 3 != 0) res++;
    }
    return res;
    }
}