class Node {
    int val;
    Node next;

    Node(int val1) {
        this.val = val1;
        this.next = null;
    }
}

public class Leetcode_61_Rotate_List {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        Node head = Convert2Ll(nums);
        Node newHead = Rotate_LL(head, 3);
        while(newHead!= null){
            System.out.print(newHead.val + "-> ");
            newHead = newHead.next;
        }

    }

    public static Node Rotate_LL(Node head, int k) {
        Node temp = head;
        int n = 1;
        while (temp.next != null) {
            temp = temp.next;
            n++;
        }
        if(head == null || head.next==null|| k==0){
            return head;
        }

        temp.next = head;
        // Avoid unnecessary rotations
        k = k % n;

        if (k == 0) {
            return head;
        }

        int size = n - k;
        Node newTail = head;
        for (int i = 1; i < size; i++) {
            newTail = newTail.next;

        }
        Node newHead = newTail.next;
        // Break the circle
        newTail.next = null;

        return newHead;

    }

    public static Node Convert2Ll(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
