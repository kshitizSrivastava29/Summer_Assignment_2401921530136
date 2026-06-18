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
    int ans = Integer.MIN_VALUE;
    int findMax(TreeNode root){
       if(root == null)return Integer.MIN_VALUE;
       if(root.left == null && root.right == null){
        ans = Math.max(ans,root.val);
        return root.val;
       }
       int left = findMax(root.left);
       int right = findMax(root.right);
       
       int sum = Integer.MIN_VALUE;
       if(left != Integer.MIN_VALUE && right != Integer.MIN_VALUE)sum = root.val + left + right;

       int val1 = root.val;
       int val2 = root.val + Math.max(left,right);
       int val3 = sum;
    
       int temp = Math.max(val1, Math.max(val2,val3));
       ans = Math.max(ans,temp);
       
       return Math.max(val1,val2);
    }
    public int maxPathSum(TreeNode root) {
        int m = findMax(root);
        return ans;
    }
}
