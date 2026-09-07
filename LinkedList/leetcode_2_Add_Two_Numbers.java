

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val1) {
        this.val= val1;
        next = null;


    }

    

}
public class leetcode_2_Add_Two_Numbers {
    public static void main(String[] args) {
        
    }
    public static ListNode final_num(ListNode l1,ListNode l2){
        ListNode dummyNode = new ListNode(0);
        ListNode curr = dummyNode;
        int carry =0;


        while(l1!=null || l2 != null||carry!=0){
            int sum =0;

            if(l1!= null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!= null){
                sum +=l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;

            ListNode newNode = new ListNode(sum%10);
            curr.next = newNode;

            curr = curr.next;

            


        }
        return dummyNode.next;

    }
}
