package easy.easy_94;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inorder(root,res);
        return  res;

    }

    private void inorder(TreeNode root, List<Integer> res) {
        if(root==null){
            return;
        }
        //左根右
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}
