package easy.easy_101;

/**
 * 对称二叉树
 *
 * 给你一个二 叉树的根节点 root ， 检查它是否轴对称。
 */
public class lk_101 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        boolean symmetric = new Solution().isSymmetric(treeNode);
        System.out.println(symmetric);
    }
}
