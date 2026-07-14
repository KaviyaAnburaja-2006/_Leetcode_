// Last updated: 7/14/2026, 2:13:10 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
    int a=num%10;
    return (num < 10) ? true : (num%10 == 0) ? false : true;
}}