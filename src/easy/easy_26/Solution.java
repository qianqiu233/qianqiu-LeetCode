package easy.easy_26;

public class Solution {
    //从左边开始判断，第一个不会相同的，不用判断，直接找下一个，
    //如果相同，就往后面找，找到不同的就把值赋给当前的index，对应的就得少读取一个位置，
    public int removeDuplicates(int[] nums) {
        int len= nums.length;
        if(len==0){
            return 0;
        }
        int index=1;
        int next=1;
        while (next<len){
            if (nums[next]!=nums[next-1]){
                nums[index]=nums[next];
                index++;
            }
            next++;
        }
        return index;
    }
}
