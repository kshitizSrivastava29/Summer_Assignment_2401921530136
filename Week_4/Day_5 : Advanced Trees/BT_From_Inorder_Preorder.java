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
    int idx = -1;
    int findIdx(int[] inorder , int num){
        
        for(int i = 0 ; i < inorder.length ; i++){
            if(inorder[i] == num)return i; 
        }
        return -1;
    }
    TreeNode build(int[] preorder, int[] inorder,int i , int j){
     if(i > j || j < i)return null;
     idx++;
     TreeNode newNode = new TreeNode(preorder[idx]);
     int x = findIdx(inorder,preorder[idx]);
     newNode.left = build(preorder,inorder,i,x-1);
     newNode.right = build(preorder,inorder,x+1,j);
     return newNode;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1);
    }
}
