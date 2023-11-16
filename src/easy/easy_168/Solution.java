package easy.easy_168;

public class Solution {
        public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] res=new int[nums.length];
        for (int i = 0; i < length; i++) {
            res[(i+k)%length]=nums[i];
        }
        System.arraycopy(res,0,nums,0,res.length);
        for (int i = 0; i < length; i++) {
            System.out.print(res[i]);
        }
    }
}
