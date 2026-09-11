class Node {
    int val;
    Node next;

    Node(int val1) {
        this.val = val1;
        this.next = null;
    }
}

public class Leetcode_82_Remove_Duplicates_from_Sorted_List_2 {
    public static void main(String[] args) {

    }

    public static Node RemoveAllDuplicates(Node head) {
        Node prev = null;
        Node curr = head;
        Node Dummy = new Node(0);
        if(head == null || head.next == null){
            return head;
        }

        while (curr != null) {
            if(curr.val != curr.next.val){
                prev = prev.next;
                curr = curr.next;
            }
            else{
                if(curr.val == curr.next.val){
                    while(curr.next != null && curr.val == curr.next.val){
                        curr = curr.next;
                    }
                    prev.next = curr.next;
                }

            }
        }
        return Dummy.next;

    }

}
