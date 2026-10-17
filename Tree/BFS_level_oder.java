import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data1){
        this.data = data1;
        this.left = null;
        this.right = null;

    }
}
public class BFS_level_oder {
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> BFS(TreeNode root){
        List<List<Integer>> Level_wise_node = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null){
            return Level_wise_node;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int len_queue = queue.size();
            List<Integer> sublist = new LinkedList<>();
            for(int i =0; i<len_queue;i++){
                TreeNode node = queue.poll();
                sublist.add(node.data);
                if(queue.peek().left != null ){
                    queue.add(node.left);
                }
                else if(queue.peek().right != null){
                    queue.add(node.right);
                }
                else{
                    Level_wise_node.add(sublist);
                }
            }
        }    
        return Level_wise_node;

    }
    
}
