class ListNode {
    int val;
    ListNode next;

    ListNode(int val1) {
        this.val = val1;
        this.next = null;
    }
}

public class leetcode_25_Reverse_Nodes_in_k_Group {
    public static void main(String[] args) {

    }

    public static ListNode Rotate_k_group_LL(ListNode head, int k){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev = dummy;
        while (true) {
            // Get the k-th node in the current group
            ListNode kth = Kth(groupPrev, k);
            if (kth == null) break;
            ListNode groupNext = kth.next;

            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;

            for(int i =0; i<k; i++){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }
    return dummy.next;

    }

    public static ListNode Kth(ListNode head, int k) {
        ListNode temp = head;
        while (temp != null && k > 0) {
            temp = temp.next;
            k--;
        }
        return temp;

    }
}
