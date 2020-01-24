/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode L;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        if(l1.val < l2.val) {
            L = l1;
            l1 = l1.next;
        }
        else {
            L = l2;
            l2 = l2.next;
        }
        ListNode cur = L;
        while(l1 != null && l2 != null) {
            //System.out.println(l1.val + " | " + l2.val);
            if(l1.val <= l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
                continue;
            }
            else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
                continue;
            }
        }
        if(l1 == null)
            cur.next = l2;
        else
            cur.next = l1;
        return L;
    }
}
