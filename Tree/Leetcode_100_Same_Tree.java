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
public class Leetcode_100_Same_Tree {
    public static void main(String[] args) {
        
    }
    public static boolean SameTree(TreeNode p , TreeNode q){
        if(p== null || q == null){
            return p == q;
        }
        return (p.val == q.val) && SameTree(p.left, q.left) && SameTree(p.right , q.right);
        }
        
}
