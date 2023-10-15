package easy.easy_94;

/**
 * 给定一个 二 叉树的根节点 root ，返回 它的 中序 遍历 。
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 */
public class lk_94 {
    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        System.out.println(new Solution().inorderTraversal(treeNode));
    }
}
