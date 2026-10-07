import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val ;
    TreeNode left ;
    TreeNode right;
    TreeNode(int data){
        this.val = data;
        this.left = null;
        this.right = null;

    }
}
public class preOder {
    public static void main(String[] args) {
        
    }
    public static List<Integer> preorder_traversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;

    }
    public static void preorder(TreeNode root , List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);


    }
    
}
