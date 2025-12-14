
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int d){
        data=d;
        left=null;
        right=null;
    } 
}



public class TreeMain{
    public static int countTree(TreeNode root){
        if(root==null){
            return 0;
        }

      return 1 + countTree(root.left) + countTree(root.right); 

    }
 public static void main(String[] args) {
    TreeNode root =new TreeNode(1);
    root.left=new TreeNode(2);
    root.left.left=new TreeNode(3);
    root.left.right=new TreeNode(2);
    root.left.right.left=new TreeNode(5);
    root.left.right.right=new TreeNode(6);
    root.right=new TreeNode(5);
    root.right.left=new TreeNode(8);
    root.right.right=new TreeNode(4);
    root.right.right.left=new TreeNode(9);
    System.out.println(countTree(root));
 }
}