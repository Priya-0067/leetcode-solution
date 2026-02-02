// Last updated: 2/2/2026, 2:16:22 PM
import java.util.Arrays;

class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int smallestSum = 0;
        int largestSum = 0;

        
        for (int i = 0; i < k; i++) {
            smallestSum += nums[i];
        }

        
        for (int i = nums.length - k; i < nums.length; i++) {
            largestSum += nums[i];
        }

        return Math.abs(largestSum - smallestSum);
    }
}