package Easy;
//https://leetcode.com/problems/merge-two-sorted-lists/



 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class P5 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //copy list1 to l1 and list2 into l2
        // if the l1 is null return l2
        // if l2 is null return l1
        // create a node first and last set them as equals
        // check if l1 value is less than or equal to l2
            // set last node value as l1 value.
            // move l1
        // if not
            // set last node value as l2 value.
            // move l2
        // loop till l1 or l2 becomes null
            // check if l1 value is less than or equal to l2
                // set last node next value as l1 value.
                // move l1
            // if not
                // set last node next value as l2 value.
                // move l2
            // move last;
        // check if l1 null
            // set last node next value as l2.

        // if l2 is null
            // set last node next value as l1
        //  return firstNode
        ListNode l1= list1;
        ListNode l2= list2;
        if(l1==null) return l2;
        if(l2== null) return l1;

        ListNode first= new ListNode();
        ListNode last= first;
        if(l1.val<= l2.val){
            first.val= l1.val;
            l1= l1.next;
        }else{
            first.val= l2.val;
            l2=l2.next;
        }
        while(l1!= null && l2!=null){
            if(l1.val<= l2.val){
                last.next= new ListNode(l1.val);
                l1= l1.next;

            }else{
                last.next= new ListNode(l2.val);
                l2=l2.next;
            }
            last = last.next;
        }
        if(l1==null)
            last.next= l2;
        else
            last.next= l1;
        return first;
    }
}
