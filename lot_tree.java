import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class lot_tree {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=0;i<n;i++){
                Node temp=q.poll();
                level.add(temp.data);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            arr.add(level);
        }
        return arr;
    }
}
