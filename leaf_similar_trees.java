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

 List < Integer > list1 = new ArrayList < Integer > ();
 List < Integer > list2 = new ArrayList < Integer > ();
 public boolean leafSimilar(TreeNode root1, TreeNode root2) {

  calculateLeaf(root1, list1);
  calculateLeaf(root2, list2);
  // if both equal then return true
  if (list1.equals(list2))
   return (true);
  else
   return (false);
 }
 private void calculateLeaf(TreeNode node, List < Integer > list) {
  //
  if (node == null)
   list.add(null);
  //if node with no children
  if (node.left == null && node.right == null)
   list.add(node.val);
  else if (node.left == null && node.right != null)
   calculateLeaf(node.right, list);
  else if (node.right == null && node.left != null)
   calculateLeaf(node.left, list);
  else {
   calculateLeaf(node.left, list);
   calculateLeaf(node.right, list);
  }

 }
}