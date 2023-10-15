package easy.easy_100;

import com.sun.org.apache.bcel.internal.generic.NEW;
import sun.reflect.generics.tree.Tree;

/**
 * 判断两棵树是否相同
 */
public class lk_100 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1, new TreeNode(2), new TreeNode(4));
        TreeNode treeNode2 = new TreeNode(1, new TreeNode(3), new TreeNode(4));
        Solution solution = new Solution();
        boolean sameTree = solution.isSameTree(treeNode1, treeNode2);
        System.out.println(sameTree);

    }
}
