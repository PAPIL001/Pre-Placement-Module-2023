class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        
        boolean ans =  isSameTree(leftNode, rightNode);
        return ans;
 }
    public boolean isSameTree(TreeNode p, TreeNode q) {
    
     if(p == null || q == null){
           return p == q;
        }
        
        if(p.val != q.val){
            return  false;
           
        }
      return  isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
        
    }
}