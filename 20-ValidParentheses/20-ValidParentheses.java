// Last updated: 7/14/2026, 2:14:31 PM
class Solution {
    public boolean isValid(String s) {
        while(s.contains("()")|| s.contains("[]")||s.contains("{}")){
            s=s.replace("()","");
            s=s.replace("[]","");
            s=s.replace("{}","");
        }
        return s.length()==0;
    }
}