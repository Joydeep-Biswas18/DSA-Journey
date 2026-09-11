
import java.util.HashMap;
import java.util.HashSet;

class Node{
    int val;
    Node next;
    Node(int val1){
        this.val = val1;
        this.next = null;
    }
}
public class Leetcode_142_Linked_List_Cycle_2 {
    public static void main(String[] args) {
        
    }
    public static int Detect_cycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow!= fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                Node temp = head;
                int n =0;
                while(temp.next.next!= slow){
                    n++;
                    temp = temp.next;
                }
                return n;
            }
            return 1;
        }
    }
    public static Node Find_starting_of_cycle(Node head ){
        Node temp = head;
        HashSet <Node> map = new HashSet<>();
        while(temp != null){
            if(map.contains(temp)){
                return temp;
            }
            map.add(temp);

            temp = temp.next;
        }
        return null;
    }
    
}
