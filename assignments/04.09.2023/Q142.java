public class Q142 {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        boolean cycle =false;
        ListNode slow = head , fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow)
            {
                cycle = true;
                break;
            }
        }
        if(!cycle) return null;
        slow = head;
        while(slow!=fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
