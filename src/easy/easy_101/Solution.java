package easy.easy_101;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root.left== null && root.right == null){
            return true;
        }
        return res(root.left,root.right);
    }
    public boolean res(TreeNode l,TreeNode r){
        if(l == null && r == null){
            return true;
        }
        if (l == null || r == null){
            return false;
        }
        if (l.val!=r.val){
            return false;
        }
        return res(l.left,r.right) && res(l.right,r.left);
    }
}
