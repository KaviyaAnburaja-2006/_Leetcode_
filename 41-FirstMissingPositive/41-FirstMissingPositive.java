// Last updated: 7/14/2026, 2:14:18 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
       Arrays.sort(nums);
       int missing=1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==missing){
            missing++;
        }
       } 
       return missing;
    }
}