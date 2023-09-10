public class Q234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode temp = head;
        ListNode prev = null;
        while(head!=null)
        {
            ListNode curr = new ListNode(head.val);
            curr.next = prev;
            prev = curr;
            head = head.next;
        }
        ListNode reversed = prev;
        while(temp!=null)
        {
            if(reversed.val!= temp.val) return false;
            reversed = reversed.next;
            temp = temp.next;
        }
        return true;
    }
}
