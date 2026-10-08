public class Leetcode_104_Maximum_Depth_of_Binary_Tree {
    public static void main(String[] args) {
        
    }
    public static int Max_depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = Max_depth(root.left);
        int rh = Max_depth(root.right);
        return 1+ Math.max(lh , rh);
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }
    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
