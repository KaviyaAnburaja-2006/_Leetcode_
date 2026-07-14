// Last updated: 7/14/2026, 2:13:05 PM
    class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] answer = new int[nums.length];

        int lSum = 0;
        int rSum = 0;

        for (int i = 0; i < nums.length; i++) {
            lSum += nums[i];
            left[i] = lSum;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            rSum += nums[i];
            right[i]=rSum;
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(left[i] - right[i]);
        }
        return answer;
    }
}

        
    
