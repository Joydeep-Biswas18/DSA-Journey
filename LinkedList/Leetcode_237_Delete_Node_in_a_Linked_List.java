class ListNode {
    int data;
    ListNode next;

    // Constructor
    ListNode(int data1, ListNode next1) {
        this.data = data1;
        this.next = next1;
    }

    ListNode(int data1) {
        this.data = data1;
        this.next = null;

    }
}

public class Leetcode_237_Delete_Node_in_a_Linked_List {

    public static void main(String[] args) {

        int[] arr = { 4, 5, 2, 8 };

        // Create linked list
        ListNode head = Conver2LL(arr);

        // Suppose we want to delete node 5
        ListNode node = head.next;

        // Delete node
        DeleteAnyNode(head , node);
        System.out.println("2nd one :");
        // DeleteNthNode(node);

        // Print linked list
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void DeleteNthNode(ListNode node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    
public static ListNode DeleteAnyNode(ListNode head, ListNode node) {

    if (head == null || node == null) {
        return head;
    }

    // If the node to delete is the head
    if (head == node) {
        return head.next;
    }

    ListNode temp = head;
    ListNode prev = null;

    while (temp != null) {

        if (temp == node) {
            prev.next = temp.next;
            break;
        }

        prev = temp;
        temp = temp.next;
    }

    return head;
}



    public static ListNode Conver2LL(int[] arr) {

        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }
}
