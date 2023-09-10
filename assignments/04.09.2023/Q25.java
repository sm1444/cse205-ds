public class Q25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode next = null;
        int count = 0,len=0;
        while(temp!=null )
        {
            len++;
            temp = temp.next;
        }
        temp = head;
        if(len<k) return head;
        if(head==null) return null;
        while(temp!=null && count<k)
        {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            count++;
        }
        if(next!=null)
        {
            head.next = reverseKGroup(next,k);
        }
        return prev;
    }
}
