import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left ;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class postOrder {
    public static void main(String[] args) {
        
    }
    public static List<Integer> Postorder_traversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;

    }
    public static void postorder(TreeNode root , List<Integer> list){
        if(root == null){
            return;
        }
        postorder(root.left ,list);
        postorder(root.right , list);
        list.add(root.val);
    } 
    
}
