class Node{
    int val;
    Node next;

    public Node(int val1) {
        this.val = val1;
        this.next = null;
    }
    Node(int val1 , Node next1){
        this.val = val1;
        this.next = next1;
    }
    
}
public class Insert_eleemnt {
    public static void main(String[] args) {
        int [] nums = {2,3,4,5,67,7,34};
        Node head = Convert2Ll(nums);
        head = Insert_El(head, 4, 1000);
        head = Insert_El(head, 6, 100);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
        head = InsertBeforeValue(head, 999, 100);
        Node temp1 = head;
        while(temp1!=null){
            System.out.print(temp1.val+" ");
            temp1 = temp1.next;
        }

        
    }
    //Insert Elemeent at any position
    public static Node Insert_El(Node head, int k, int el){
        if(head == null){
            if(k==1){
                return new Node(el, head);
            }
            return null;
        }
        if(k==1){
            return new Node(el);

        }
        Node temp = head;
        int count =0;
         while(temp!=null){
            count++;
            if(count == (k-1)){
                Node newNode = new Node(el , temp.next);
                temp.next = newNode;
                break;


            }
            else{
                temp = temp.next;
            }
         }
         return head;

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

    //Insert Eleement before Any given value
    public static Node InsertBeforeValue(Node head, int ele, int val){
        if(head == null){
            return null;
            //Beacude if head is null so there are no any element before it
        }
        //if head is val
        if(head.val == val){
            return new Node(ele,head);

        }
        //if val is present any where i mean Worst case
        Node temp = head;
        while(temp.next!= null){
            if(temp.next.val == val){
                Node x = new Node(ele,temp.next);
                temp.next = x;
                break;

            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }

}