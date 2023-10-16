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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        int len = 0;
        while(temp!=null)
        {
            len++;
            temp = temp.next;
        }
        temp = head;
        int[] arr = new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i] = temp.val;
            temp = temp.next;
        }
        temp = head;
        Arrays.sort(arr);
        for(int i=0;i<len;i++)
        {
            temp.val = arr[i];
            temp = temp.next;
        }
        return head;
    }
}
