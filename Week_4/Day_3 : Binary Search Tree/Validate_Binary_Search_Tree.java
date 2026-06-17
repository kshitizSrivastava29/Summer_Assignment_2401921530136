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
      boolean validate(TreeNode root, long minRange , long maxRange){
        if(root == null)return true;
        if(minRange < root.val && root.val < maxRange){
            return validate(root.left,minRange,root.val) && validate(root.right,root.val,maxRange);
        }else{
            return false;
        }
      }
    public boolean isValidBST(TreeNode root) {
        return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
