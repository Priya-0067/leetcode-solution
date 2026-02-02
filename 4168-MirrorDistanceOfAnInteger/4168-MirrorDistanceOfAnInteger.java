// Last updated: 2/2/2026, 2:16:23 PM
class Solution {
    public int mirrorDistance(int n) {
        int rev=0 , temp = n;
        while(temp>0) {
            rev= rev*10+temp%10;
            temp/=10;
        }
        return Math.abs(n-rev);
    }
}