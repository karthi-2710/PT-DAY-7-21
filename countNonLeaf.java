class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
public class countNonLeaf {
    int countNonLeafNodes(Node root) {
        // code here
        if(root==null){
            return 0;
        }
        
        if(root.left==null && root.right==null){
            return 0;
        }
        
        
        return 1 +  countNonLeafNodes(root.left) +  countNonLeafNodes(root.right);
    }
}
