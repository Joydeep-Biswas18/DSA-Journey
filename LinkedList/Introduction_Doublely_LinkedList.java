
/**
 * Introduction_Doublely_LinkedList
 */
class Node{
    int val ;
    Node next;
    Node prev;
    Node(int val1){
        this.val = val1;
        this.next = null;
        this.prev = null;
    }
    Node(int val2 ,Node next1, Node prev1){
        this.val = val2;
        this.next = next1;
        this.prev = prev1;
    }
}
public class Introduction_Doublely_LinkedList {
    public static void main(String[] args) {
        int [] arr ={ 2,3,64,75,100};
        Node head = Covert_DLL(arr);
        while(head != null){
            System.out.print(head.val+ "--><--");
            head = head.next;
        }
        
    }
    public static Node Covert_DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        //Iterate Through Array fromo 2nd Eleement
        int n = arr.length;
        for(int i =1 ; i<n-1;i++){
            Node temp = new Node(arr[i], null , prev);
            prev.next = temp;
            prev = temp;

        }
        return head;
    }

    
}
