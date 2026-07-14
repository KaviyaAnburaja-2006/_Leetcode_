// Last updated: 7/14/2026, 2:14:12 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[]words=s.trim().split(" ");
        return words[words.length-1].length();
    }
}