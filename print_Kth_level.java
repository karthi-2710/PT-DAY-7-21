import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

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


public class print_Kth_level {
     public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root,int k) {
        // code here
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int t=0;
        while(t++<=k){
            int n=q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                level.add(temp.data);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            if(t==k)
              arr.add(level);
        }
        return arr;
    }
    public static void main(String[] args) {
         ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
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
    arr=levelOrder(root,1);
    System.out.println(arr);
    
 }
}
