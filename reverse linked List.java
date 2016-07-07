/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
      ListNode pre=null;
      ListNode current=head;
      while(current!=null){
          ListNode next= current.next;
          current.next=pre;
          pre=current;
          current=next;
      }
      return pre;
    }
}
