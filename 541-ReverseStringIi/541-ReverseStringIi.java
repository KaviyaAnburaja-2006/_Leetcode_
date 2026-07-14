// Last updated: 7/14/2026, 2:13:35 PM
class Solution {
    public String reverseStr(String s, int k) {
        char[]arr=s.toCharArray();
        for(int i=0;i<arr.length;i=i+k*2){
            int start=i;
            int end=Math.min(i+k-1,arr.length-1);
                while(start<end){
                    char temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    start++;
                    end--;
                }
            }
            return new String(arr);
        
    }
}