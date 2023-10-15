package easy.easy_21;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 */
public class lk_21 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(4)));
        System.out.println("l1:---"+l1);
        ListNode l2=new ListNode(1,new ListNode(3,new ListNode(4)));
        System.out.println("l2:---"+l2);
        Solution solution=new Solution();
        ListNode l3 = solution.mergeTwoLists(l1, l2);
        System.out.println("l3:---"+l3);

    }
}
