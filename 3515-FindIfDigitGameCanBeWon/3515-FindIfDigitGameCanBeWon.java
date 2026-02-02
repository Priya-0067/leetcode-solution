// Last updated: 2/2/2026, 2:16:37 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int s=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=10){
                d+=nums[i];
            }
            else{
                s+=nums[i];
            }
        }
        if(d>s || s>d){
            return true;
        }
        return false;
    }
}