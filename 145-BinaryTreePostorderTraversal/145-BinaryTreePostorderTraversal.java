// Last updated: 7/14/2026, 2:13:56 PM
class Solution {
    List<Integer>li=new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root!=null){
            postorderTraversal(root.left);
             postorderTraversal(root.right);
             li.add(root.val);
        }
        return li;
    }
}