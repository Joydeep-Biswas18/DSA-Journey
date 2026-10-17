
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Leetcode_543_Diameter_of_Binary_Tree {
    public static void main(String[] args) {
        
    }
    static int diameter =0;
    
    public static int Diameter_of_Tree(TreeNode root) {
        diameter =0;
        max_height(root);
        return  diameter;

    }

    public static int max_height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = max_height(root.left);
        int rh = max_height(root.right);
        diameter = Math.max(diameter, lh + rh);

        return 1 + Math.max(lh , rh);
    }
}
