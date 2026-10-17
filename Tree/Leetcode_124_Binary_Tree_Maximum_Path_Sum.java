class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class Leetcode_124_Binary_Tree_Maximum_Path_Sum {
    public static void main(String[] args) {
        
    }
    static int path_sum =Integer.MIN_VALUE;
    public static int max_sum(TreeNode root){
        if(root==null){
            return 0;
        }
        int ls = max_sum(root.left);
        int rs = max_sum(root.right);

        path_sum = Math.max(path_sum , root.val+ls + rs);

        return root.val + Math.max(ls,rs);

    }
}
