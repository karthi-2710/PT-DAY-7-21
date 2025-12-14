/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class kth_Largest_BST{
    // return the Kth largest element in the given BST rooted at 'root'
    public int i;
    public int answer;
    public void inorder(Node root,int k){
        if(root == null){
            return;
        }
        inorder(root.right,k);
        i++;
        if(i==k){
            answer=root.data;
            return;
        }
        inorder(root.left,k);
    }
    
    public int kthLargest(Node root, int k) {
        // Your code here
        i=0;
        answer=-1;
        inorder(root,k);
        return answer;
    }
}