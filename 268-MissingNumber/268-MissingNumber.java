// Last updated: 2/2/2026, 2:18:30 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xorAll =0;
        int xorNums =0;
        for(int i=0;i<=n;i++) {
            xorAll ^=i;
        }
        for( int num : nums) {
            xorNums ^= num;
        } 
        return xorAll ^ xorNums;
    }
}