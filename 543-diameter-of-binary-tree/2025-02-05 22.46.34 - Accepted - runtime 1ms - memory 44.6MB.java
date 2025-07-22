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
    static class TreeInfo{
            int ht;
            int diam;
            TreeInfo(int ht,int diam){
                this.ht=ht;
                this.diam=diam;
            }
        }
        public static TreeInfo diameter2(TreeNode root){
            if(root==null) return new TreeInfo(0,0);
            TreeInfo left=diameter2(root.left);
            TreeInfo right=diameter2(root.right);
            int myHeight=Math.max(left.ht,right.ht)+1;
            int diam1=left.diam;
            int diam2=right.diam;
            int diam3=left.ht+right.ht+1;
            int mydiam=Math.max(diam1, Math.max(diam3, diam2));
            TreeInfo myInfo=new TreeInfo(myHeight, mydiam);
            return myInfo;}
    // public int height(TreeNode root){
    //     if(root==null) return 0;
    //     int l=height(root.left);
    //     int r=height(root.right);
    //     return Math.max(l,r)+1;
    // }
    public static int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        // int diam1=diameterOfBinaryTree(root.left);
        // int diam2=diameterOfBinaryTree(root.right);
        // int diam3=height(root.left)+height(root.right)+1;
        // return Math.max(diam1,Math.max(diam2,diam3))-1;
        return diameter2(root).diam-1;
    }
}