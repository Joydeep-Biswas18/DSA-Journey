class ListNode{
    int val;
    ListNode next;

    ListNode(int val1){
        this.val = val1;
        this.next = null;
    }
    ListNode(int val2 , next1){
        this.val = val2;
        this.next = next1;
    }
}

public class leetcode_234_Palindrome_Linked_List {
    public static void main(String[] args) {
        
    }
    public static boolean isPalindrome (ListNode head){
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        //Find middle point
        while(fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow;
        ListNode prev = null;

        while(curr!= null){
            ListNode newtemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newtemp;
        }
        ListNode p1 = head;
        ListNode p2 = prev;

        while(p2!=null){
            if(p1.val != p2.val){
                return false;
            }

        }
        return true;
    }
}
