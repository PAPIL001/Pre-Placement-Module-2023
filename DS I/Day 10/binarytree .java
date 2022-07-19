class Solution {
    List<Integer> al=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root==null){
            return al ;
        }
        al.add(root.val); //adding current node value
        al=preorderTraversal(root.left);//traversing upto last left node
        al=preorderTraversal(root.right);//traversing upto last right node
        return al;
        
    }
}