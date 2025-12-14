/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class binary_search_tree {
    public boolean search(Node root, int key) {
        // code here
        // if(root==null){
        //     return false;
        // }
        
        // if(root.data==key){
        //     return true;
        // }else if(root.data<key){
        //     return search(root.right,key);
        // }else{
        //     return search(root.left,key);
        // }
        
        while(root!=null){
        if(root.data==key){
            return true;
        }else if(root.data<key){
            root=root.right;
        }else{
            root=root.left;
        }
        
        }
        
        return false;
    }
}