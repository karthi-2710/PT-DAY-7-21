
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



public class count_twochild{

  static int ctc(TreeNode root){
        if(root==null){
            return 0;
        }

        if(root.left!=null && root .right!=null){
            return 1+ctc(root.left) + ctc(root.right);
        }
     
       return ctc(root.left) + ctc(root.right);

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
    System.out.println(ctc(root));
 }
}
