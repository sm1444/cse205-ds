class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        int len = 0;
        while(temp!=null)
        {
            temp = temp.next;
            len++;
        }
        temp = head;
        int[] arr = new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        for(int i=0;i<len;i++)
        {
            temp.val = arr[i];
            temp = temp.next;
        }
        return head;
    }
}
