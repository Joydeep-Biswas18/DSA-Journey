
import java.util.*;

public class Leetcode_138_Copy_List_with_Random_Pointer {
    public static void main(String[] args) {

    }

    public static Node DeepCopyLL(Node head) {
        Node temp = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (temp != null) {
            Node newNode = new Node(temp.val);
            map.put(temp, newNode);
            temp = temp.next;

        }
        temp = head;
        while (temp != null) {
            Node CopyNode = map.get(temp);
            CopyNode.next = map.get(temp.next);
            CopyNode.random = map.get(temp.random);

            temp = temp.next;
        }

        return map.get(head);

    }
}

class Node {
    int val;
    Node next;
    Node random;

    Node(int val1) {
        this.val = val1;
        this.next = null;
        this.random = null;
    }
}
