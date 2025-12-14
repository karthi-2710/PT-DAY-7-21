Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class CheckBT {
    
    int countNodes(Node root){
        if(root==null){
            return 0;
        }
        return 1+countNodes(root.left) + countNodes(root.right);
    }
    
    boolean ccBT(Node root,int n,int i){
        if(root==null){
            return true;
        }
        if(i>=n){
            return false;
        }
        
        return ccBT(root.left,n,2*i+1) && ccBT(root.right,n,2*i+2);
    }
    
    boolean isCompleteBT(Node root) {
        // add code here.
        int n=countNodes(root);
        return ccBT(root,n,0);
        
    }
}