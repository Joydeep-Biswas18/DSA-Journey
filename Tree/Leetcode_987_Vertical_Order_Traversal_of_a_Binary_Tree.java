import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right ;
    TreeNode(int val){
        this.val = val;
        this.right = null;
        this.left = null;
    }
}
public class Leetcode_987_Vertical_Order_Traversal_of_a_Binary_Tree {
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> vertical_Order_tree_ele(TreeNode root){
        List<int[]> nodes = new ArrayList<>();
        dfs(root, 0, 0, nodes);

        nodes.sort((a,b)->{
            if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }
            else if(a[1]!=b[1]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[2], b[2]);
        });

        int prev_col =0;
        List<List<Integer>> result = new ArrayList<>();
        for(int[] node : nodes){
            int col = node[0];
            int val = node[2];

            if(col != prev_col){
                result.add(new ArrayList<>());
                prev_col = col;

            }
            result.get(result.size()-1).add(val);
            
        }
        return result;

    }
    public static void dfs(TreeNode root ,int col , int row, List<int[]> nodes){
        if(root == null){
            return ;
        }
        nodes.add(new int[]{col,row,root.val});
        dfs(root.left, col-1, row+1, nodes);
        dfs(root.right, col+1, row+1, nodes);

    }
}