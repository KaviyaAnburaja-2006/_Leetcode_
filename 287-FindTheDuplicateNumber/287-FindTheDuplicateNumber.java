// Last updated: 7/14/2026, 2:13:44 PM
class Solution {
    public int findDuplicate(int[] nums) {
       int n=nums[0];
       int m=nums[0];
       do{
         n=nums[n];
         m=nums[nums[m]];
       }while(n!=m);
        n=nums[0];
        while(n!=m){
            n=nums[n];
            m=nums[m];
        }
        return n;
       
     
        
    }
}