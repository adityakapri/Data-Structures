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
 public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
  // if both node null
  TreeNode t3 = null;
  if (t1 == null && t2 == null) {
   return (null);
  }
  //if one node is null and one is not
  else if (t1 == null && t2 != null) {
   return t2;
  } else if (t1 != null && t2 == null) {
   return t1;
  } else {
   t3 = new TreeNode(t1.val + t2.val);
  }
  t3.left = mergeTrees(t1.left, t2.left);
  t3.right = mergeTrees(t1.right, t2.right);
  return t3;

 }
}