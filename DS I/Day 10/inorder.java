class Solution
{
public List inorderTraversal(TreeNode root)
{
List node=new ArrayList();
if(root!=null)
{
node.addAll(inorderTraversal(root.left));
node.add(root.val);
node.addAll(inorderTraversal(root.right));
}
return node;
}
}