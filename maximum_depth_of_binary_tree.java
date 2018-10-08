/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
 public int maxDepth(TreeNode root) {
  int maxDepth = 0;
  int leftDepth = 0;
  int rightDepth = 0;
  //if root null
  if (root == null)
   return (maxDepth);
  //if root has no child then length is equal to 1
  if (root.left == null && root.right == null)
   return (maxDepth = 1);
  leftDepth = 1 + maxDepth(root.left);
  rightDepth = 1 + maxDepth(root.right);
  return (leftDepth >= rightDepth ? leftDepth : rightDepth);

 }
}