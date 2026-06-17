/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int count = 1;
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        List<Integer> list ;
        Deque<TreeNode> dq = new LinkedList<>();
        dq.offerLast(root);
        while(!dq.isEmpty()){
            list = new ArrayList<>();
            int n = dq.size();
          if(count % 2 != 0){
            for(int i = 0 ; i  < n ; i++){
                TreeNode temp = dq.pollFirst();
                if(temp.left != null)dq.offerLast(temp.left);
                if(temp.right != null)dq.offerLast(temp.right);
                list.add(temp.val);
            }
          }else{
                for(int i = 0 ; i < n ; i++){
                TreeNode temp = dq.pollLast();
                if(temp.right != null)dq.offerFirst(temp.right);
                if(temp.left != null)dq.offerFirst(temp.left);
                list.add(temp.val);
            }
          }
          ans.add(list);
          count++;
          
        }
        return ans;
    }
}
