// Last updated: 7/14/2026, 2:13:01 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
     return (arrivalTime + delayedTime)%24;   
    }
}