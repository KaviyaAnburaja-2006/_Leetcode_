// Last updated: 7/14/2026, 2:13:31 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }
        int count=0;
        for(int i=0;i<stones.length();i++){
            if(set.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}