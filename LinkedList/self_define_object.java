class Node {
    int data;
    Node next;

    // Constructor
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;

    }
}

public class self_define_object {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 };
        Node y = new Node(arr[0], null);
        System.out.println(y.data);

        System.out.println("The head of the LinkedList");
        Node head = Convert2Ll(arr);
        System.out.println(head.data);

        // traverse through the array
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // Length of linkedList
        int length = lengthofLL(head);
        System.out.println();
        System.out.println("The length of the LinkedList is" + length);

        // Delete The Head
        head = DeleteHead(head);
        System.out.println();
        // System.out.println(head);
        Node temp2 = head;
        while (temp2 != null) {
            System.out.print(temp2.data + " ");
            temp2 = temp2.next;

        }
        
        //Delete Last Element\
        System.out.println();
        head = DeleteLast(head);
        Node temp3 = head;
        while (temp3 != null) {
            System.out.print(temp3.data + " ");
            temp3 = temp3.next;

        }

    }

    public static int lengthofLL(Node head) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
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

    public static Node DeleteHead(Node head) {
        if (head == null) {
            return head;

        } else {
            // Update head of the LL
            head = head.next;

        }
        return head;
    }

    public static Node DeleteLast(Node head){
        if(head == null|| head.next ==null) return null;
        Node temp = head ;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next=null;


        return head;

}
}
