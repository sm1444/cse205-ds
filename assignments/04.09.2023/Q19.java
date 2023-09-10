public class Q19 {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head==null || head.next==null) return null;
            ListNode temp = new ListNode();
            ListNode slow = temp , fast = temp;
            temp.next = head;
            for(int i=1;i<=n;i++)
            {
                fast = fast.next;
            }
            while(fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return temp.next;
        }
    } 
