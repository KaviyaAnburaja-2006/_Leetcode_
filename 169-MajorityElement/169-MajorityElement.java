// Last updated: 7/14/2026, 2:13:54 PM
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
        
    
