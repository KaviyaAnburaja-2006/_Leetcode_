// Last updated: 7/14/2026, 2:13:26 PM
class Solution {
    public String greatestLetter(String s) {
         Set<Character> set=new HashSet<>();
        for(char ch: s.toCharArray())
            set.add(ch);
        for(char ch='Z';ch>='A';ch--)
        if(set.contains(ch) && set.contains((char)('a'+(ch-'A'))))
        return ""+ch;
        return "";
        
    }
}