package medium.medium_55;

public class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length<=1){
            return true;
        }
        //当前位置能够跳到的最远下标
        int max=0;
        for (int i=0;i<nums.length;i++){
            //如果max>i，说明i位置下标可到达
            //反之，不可到达
            if (max<i){
                return false;
            }
            //更新可跳到的最远下标
            max=Math.max(max,i+nums[i]);
            //说明是最后一个
            if (max>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}
