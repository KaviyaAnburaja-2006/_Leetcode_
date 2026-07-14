// Last updated: 7/14/2026, 2:12:53 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String a=x+"";
        LinkedList<Integer> res=new LinkedList<>();
        int i=0;
        for(String e:words){
            if(e.contains(a)){
                res.add(i);
            }
            i++;
        }
        return res;
    }
}