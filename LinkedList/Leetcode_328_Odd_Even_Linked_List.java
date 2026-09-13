public class Leetcode_328_Odd_Even_Linked_List {
    public static void main(String[] args) {
        
    }
    public static Node Odd_even_LinkedList(Node head){
        Node dummy = new Node(0);
        Node odd = head;
        Node even = head.next;
        dummy.next = even;
        Node resultHead = new Node(0);
        resultHead.next = odd;

        while(odd.next != null && odd.next.next != null){
            odd.next = odd.next.next;
            odd = odd.next.next;

            even.next = even.next.next;
            even = even.next.next;

            odd.next = dummy.next;

        }
        return resultHead.next;
    }
}
class Node{
    int val ;
    Node next;
    Node(int val1){
        this.val = val1;
        this.next = null;
    }

}
