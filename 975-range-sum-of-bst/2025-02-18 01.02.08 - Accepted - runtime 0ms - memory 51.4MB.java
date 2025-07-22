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
    
    public int rangeSumBST(TreeNode root, int X, int Y) {
        int sum=0;
        if(root==null) return 0;
        if(root.val>=X &&root.val<=Y){
            sum=sum+rangeSumBST(root.left, X, Y);
            sum= sum+root.val;
            sum=sum+rangeSumBST(root.right, X, Y);
            return sum;
        }
        else if(root.val>=Y){
            sum=sum+rangeSumBST(root.left, X, Y);
        }
        else{
        sum=sum+ rangeSumBST(root.right, X, Y);
        }
        return sum;
    }
    
}