public class Leetcode_2095_Delete_the_Middle_Node_of_a_Linked_List {
    public static void main(String[] args) {
        
    }
    public static Node Remove_Middle_elemenet(Node head){
        Node fast = head;
        Node slow = head;
        Node prev = null;
        while(fast!= null && fast.next!= null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;

        }
        prev.next = slow.next;
        return head;

    }
    
}
class Node{
    int val;
    Node next;
    Node(int val1){
        this.val = val1;
        this.next = null;
    }
}