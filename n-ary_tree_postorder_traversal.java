/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
 List < Integer > postOrder = new ArrayList < Integer > ();
 public List < Integer > postorder(Node root) {

  // if null
  if (root == null) {
   return (postOrder);
  }
  if (root.children.size() > 0) {
   //iterate over all the children
   for (int i = 0; i < root.children.size(); i++) {
    postOrder = postorder(root.children.get(i));
   }
  }
  System.out.println("Value added" + root.val);
  postOrder.add(root.val);
  return (postOrder);
 }

}