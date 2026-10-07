import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data1) {
        this.data = data1;
        this.left = null;
        this.right = null;
    }
}

public class inOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(inOrder(root));
        
    }

    public static List<Integer> inOrder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Inorder(root, list);
        return list;

    }

    public static void Inorder(TreeNode root, List<Integer> list){
        if(root==null){
            return ;
        }
        Inorder(root.left , list);
        list.add(root.data);
        Inorder(root.right , list);
    }
    
}
