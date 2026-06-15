/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1)return null;
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        if(n == size){
            return head.next;
        }
        int idx = size - n + 1; //1-based indexing
        int x = 1;
        curr = head;
        while(x < idx-1){
            x++;
            curr = curr.next;
        }
       curr.next = curr.next.next;
       return head;
    }
}
