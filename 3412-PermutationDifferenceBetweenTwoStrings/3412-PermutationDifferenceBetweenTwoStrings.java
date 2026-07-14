// Last updated: 7/14/2026, 2:12:57 PM
class Solution {
    public int findPermutationDifference(String s, String t) {
        int res=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)== t.charAt(j)) res+=Math.abs(i-j);
            }
        }
        return res;
    }
}