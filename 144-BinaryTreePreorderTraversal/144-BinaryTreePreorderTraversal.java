// Last updated: 7/14/2026, 2:13:57 PM
class Solution {
    List<Integer> li=new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root!=null){
            li.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return li;
    }
}