// Last updated: 2/2/2026, 2:16:24 PM
class Solution {
    public int minOperations(int[] nums) {
        int[] freq = new int[100001];
        int dup = 0;
        for(int n:nums) {
            if (++freq[n] == 2) dup++;
        }
        int ops=0,i=0;
        while (dup > 0) {
            ops++;
            for ( int k=0;k < 3 && i < nums.length; k++, i++){
                  if (freq[nums[i]]-- == 2)
                      dup--;
            }
        }
        return ops;
    }
}