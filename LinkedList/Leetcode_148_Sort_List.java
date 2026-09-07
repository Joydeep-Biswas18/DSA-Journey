class Node{
    int val ;
    Node next;
    Node(int val1){
        this.val = val1;
        this.next = null;
    }
}
public class Leetcode_148_Sort_List {
    public static void main(String[] args) {
        
    }
    public static Node Middle_position(Node head){
         // If list empty or single node
        if (head == null || head.next == null) {
            return head;
        }
        Node slow= head;
         Node fast = head;
         while(fast != null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
         }
         return slow;
    }
    public static Node merge_LL(Node list1 , Node list2){
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        if(list1!= null && list2!= null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }
        if(list1!= null){
            temp.next = list1;
        }
        else{
            temp.next = list2;

        }
        return dummyNode.next;
    }
    public static Node sort_LL(Node head ){
        if(head == null && head.next == null){
            return head;
        }
        Node middle = Middle_position(head);
        // Split into two halves
        Node right = middle.next;
        middle.next = null;
        Node left = head; 

        left = sort_LL(left);
        right = sort_LL(right);

        // Merge sorted halves
        return merge_LL(left, right);

    }
}
 