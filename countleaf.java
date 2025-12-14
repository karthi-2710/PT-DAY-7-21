class Node
{
    int data;
    Node left, right;
}
public class countleaf {
    int countLeaves(Node node) {
        
        
        // Your code
        if(node==null){
            return 0;
        }
        
        if(node.left==null && node.right==null){
            return 1;
        }
        
        return countLeaves(node.left) + countLeaves(node.right);
    }
}
