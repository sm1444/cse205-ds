public class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode();
        ListNode dummy = temp;
        int carry = 0;
        while(l1 != null || l2!=null || carry!=0)
        {
            int sum = 0;
            if(l1 !=null)
            {
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null)
            {
                sum+=l2.val;
                l2 = l2.next;
            }
            sum+=carry;
            carry = sum/10;
            ListNode newNode = new ListNode(sum%10);
            temp.next = newNode;
            temp = temp.next;
        }
        return dummy.next;
    }
}
