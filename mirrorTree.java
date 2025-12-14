public class mirrorTree {
     void mirror(Node root) {
        // code here
        if(root==null){
            return;
        }
        
        Node t=root.left;
        root.left=root.right;
        root.right=t;
        
        mirror(root.left);
        mirror(root.right);
    }
}
