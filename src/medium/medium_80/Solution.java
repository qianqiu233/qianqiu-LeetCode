package medium.medium_80;

public class Solution {
//    public int removeDuplicates(int[] nums) {
//        int len= nums.length;
//        if(len<=2){
//            return len;
//        }
//        int index=2;
//        int next=2;
//        while (next<len){
//            if (nums[index-2]!=nums[next]){
//                nums[index]=nums[next];
//                index++;
//            }
//            next++;
//        }
//        return index;
//    }
    public int removeDuplicates(int[] nums) {
       return compute(nums,2);
    }

    private int compute(int[] nums, int i) {
        int index =0;
        for (int num : nums) {
            //和前面出现的对比，如果相同就不做任何事，重新判断，如果不同
            // 将当前遍历到的数字复制到index下标那边，然后index往下走
            if(index<i||num!=nums[index-i]){
                nums[index++]=num;
            }
        }
        return index;
    }
}
