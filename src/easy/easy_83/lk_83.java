package easy.easy_83;

/**
 * 删除排序链表中的重复元素
 *
 * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 */
public class lk_83 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3,new ListNode(4))))));
        ListNode res = new Solution().deleteDuplicates(listNode);
        while (res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }
}
