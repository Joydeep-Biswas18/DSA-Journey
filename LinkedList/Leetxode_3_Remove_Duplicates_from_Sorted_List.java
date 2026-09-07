class ListNode {
    int val;
    ListNode next;

    ListNode(int val1) {
        this.val = val1;
        this.next = null;
    }

    ListNode(int val2, ListNode next1) {
        this.val = val2;
        this.next = next1;
    }

}

public class Leetxode_3_Remove_Duplicates_from_Sorted_List {
    public static void main(String[] args) {

    }

        public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if (head == null || head.next == null) {
            return head;
        }
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }

        }
        return head;
    }
}