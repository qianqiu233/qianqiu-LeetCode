package easy.easy_27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int r = nums.length;
        int l = 0;
        while (l < r) {
            if(nums[l]==val){
                //如果出现在左边，就把右边不是val的复制过来，摁进去，如果是不是val，复制过来，
                // 后面读取的时候就不能读取被复制的那个，所以右边长度-1
                nums[l]=nums[r-1];
                r--;
            }else {
                //推进
                l++;
            }

        }
        return l;
    }

}
