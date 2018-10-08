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
    public int maxDepth(Node node) {
    int maxDepth = 0;    
    // if null node
    if(node == null)
        return(maxDepth) ;
    // if only node and no child
    else if(node.children.size() == 0)
        return(maxDepth = 1 );
    else{
        int maxChildDepth = 0;
        //iterate over all the children and return the maximum depth
        for(int i = 0;i < node.children.size();i++){
            int currentDepth = 0;
            currentDepth = maxDepth(node.children.get(i));
            if(currentDepth > maxDepth)
                maxDepth = currentDepth;
        }
        return(maxDepth + 1);
    }    
    }
}