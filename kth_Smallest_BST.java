/*
class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class kth_Smallest_BST {
   
     public int i;
    public int answer;
    public void inorder(Node root,int k){
        if(root == null){
            return;
        }
        inorder(root.left,k);
        i++;
        if(i==k){
            answer=root.data;
            return;
        }
        inorder(root.right,k);
    }
    
    public int kthSmallest(Node root, int k) {
        // Your code here
        i=0;
        answer=-1;
        inorder(root,k);
        return answer;
    }
}