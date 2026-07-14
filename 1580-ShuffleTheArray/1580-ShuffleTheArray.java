// Last updated: 7/14/2026, 2:13:20 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[2*n];
        int k=0;
        for(int i=0,j=n;i<n && j<nums.length;i++,j++)
        {
            res[k]=nums[i];
            res[++k]=nums[j];
            ++k;
        }
        return res;
        
    }
}