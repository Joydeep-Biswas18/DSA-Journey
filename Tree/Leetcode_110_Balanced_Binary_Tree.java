
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public static boolean isBalanced(Node root) {
    return CheckbalanceTree(root) != -1;
}

public static int CheckbalanceTree(Node root) {
    if (root == null) {
        return 0;
    }

    int left_height = CheckbalanceTree(root.left);
    if (left_height == -1) {
        return -1;
    }

    int right_height = CheckbalanceTree(root.right);
    if (right_height == -1) {
        return -1;
    }

    if (Math.abs(left_height - right_height) > 1) {
        return -1;
    }

    return 1 + Math.max(left_height, right_height);
}