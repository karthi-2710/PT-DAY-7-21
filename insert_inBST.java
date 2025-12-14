/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class insert_inBST{
    public Node insert(Node root, int key) {
        // code here
    //     Node temp=root;
    //     Node newNode=new Node(key);
    //     Node parent=root;
    //     while(temp!=null){
    //         parent=temp;
    //         if(temp.data<key){
    //             temp=temp.right;
    //         }else{
    //             temp=temp.left;
    //         }
    //     }
        
    //     if(parent.data<key){
    //         parent.right=newNode;
    //     }else{
    //         parent.left=newNode;
    // }
    // return root;
    Node temp = root;
        if(root == null){
            return new Node(key);
        }
        else if(root.data > key){
            root.left = insert(root.left,key);
            
        }else{
            root.right = insert(root.right,key);
        }
        return temp;
        
    }
}