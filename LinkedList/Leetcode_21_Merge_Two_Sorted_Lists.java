class Node {
    int val;
    Node next;

    Node(int val1) {
        this.val = val1;
        this.next = null;
    }
}

public class Leetcode_21_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        
    }
    public static Node Merge_List(Node list1 , Node list2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        if(list1 == null && list2 ==null){
            return null;

        }
        while(list1!= null && list2!= null){
            if(list1.val <= list2.val){
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

        return dummy.next;
    }

}
