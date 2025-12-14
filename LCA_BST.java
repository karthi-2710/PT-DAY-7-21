/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class  LCA_BST{
    public Node LCA(Node root, Node n1, Node n2) {
        // code here
        if(root == null){
            return null;
        }
        if(n1.data>root.data && n2.data>root.data){
            return LCA(root.right,n1,n2);
        }
        else if(n1.data<root.data && n2.data<root.data){
            return LCA(root.left,n1,n2);
        }
        return root;
    }
}