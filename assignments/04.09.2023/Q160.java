public class Q160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA!= null)
        {
            ListNode temp = headB;
            while(temp!=null)
            {
                if(temp==headA) return headA;
                temp = temp.next;
            }
            headA = headA.next;
        } 
        return null;
     }
}
