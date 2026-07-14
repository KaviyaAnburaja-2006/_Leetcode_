// Last updated: 7/14/2026, 2:13:51 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}