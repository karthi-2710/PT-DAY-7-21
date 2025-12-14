/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */

class binaryTree_to_BST {
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    public int i;
    public void inOrder(Node root,ArrayList<Integer> ar){
        if(root==null){
            return;
        }
        inOrder(root.left,ar);
        ar.add(root.data);
        inOrder(root.right,ar);
    }
    public void transform(Node root, ArrayList<Integer> ar){
        if(root==null){
            return;
        }
        transform(root.left,ar);
        root.data=ar.get(i++);
        transform(root.right,ar);
    }
    Node binaryTreeToBST(Node root) {
        // Your code here
        int i=0;
        ArrayList<Integer> ar=new ArrayList<>();
        inOrder(root,ar);
        Collections.sort(ar);
        transform(root,ar);
        return root;
    }
}