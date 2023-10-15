package easy.easy_83;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
            return head;
        }
        //用头遍历
        ListNode res=head;
        while (head.next!=null){
            if (head.val==head.next.val){
                head.next=head.next.next;
            }else {
                head=head.next;
            }
        }
        return res;

    }
}
