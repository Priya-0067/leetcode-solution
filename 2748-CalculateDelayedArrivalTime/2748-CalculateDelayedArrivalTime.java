// Last updated: 2/2/2026, 2:16:50 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+delayedTime) % 24;
    }
}