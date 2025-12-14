class Node
{
    int data;
    Node left, right;
}

public class searchKey_inTree {
    public boolean search(Node root, int key) {
        // code here
         if(root==null){
            return false;
        }
        
        if(root.data==key){
            return true;
        }
        
        return search(root.left,key) || search(root.right,key);
    }
}
