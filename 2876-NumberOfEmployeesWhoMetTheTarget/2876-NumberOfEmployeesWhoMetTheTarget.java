// Last updated: 2/2/2026, 2:16:44 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int iCount = 0;
    for(int i = 0; i < hours.length; i++){
        if(hours[i] >= target)
        {
            iCount++;
        }
    }
    return iCount;
    }
}