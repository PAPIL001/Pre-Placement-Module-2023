class Solution {
public List<List<Integer>> levelOrder(TreeNode root) {
    
    
    List<List<Integer>> res = new ArrayList<>(); // init result 
    
    
    if(root==null) return res; // edge value
    
    Queue<TreeNode> queue = new LinkedList<>(); // for bfs
    
    queue.offer(root); // add init node
    
    while(!queue.isEmpty()){
        Queue<TreeNode> queue2 = new LinkedList<>(); // for switch to the next level;
        List<Integer> cur = new ArrayList<>(); // current level's array
        while(!queue.isEmpty()){
            TreeNode top = queue.poll();
            cur.add(top.val); //add the same level's val
            if(top.left!=null) queue2.add(top.left); // push the left & right child to queue
            if(top.right!= null) queue2.add(top.right);
        }
        res.add(cur); // add current level's array
        queue = queue2; // switch to the next level
    }
    return res;
}
}