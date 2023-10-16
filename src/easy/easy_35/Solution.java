package easy.easy_35;

public class Solution {
//1版本 o(n)
//    public int searchInsert(int[] nums, int target) {
//        //如果都不是，那就是在最后一位
//        int index=nums.length;
//        for (int i=0;i<nums.length;i++){
//            if (nums[i]==target||nums[i]>target){
//                index=i;
//                break;
//            }
//        }
//        return index;
//    }
    public int searchInsert(int[] nums, int target) {
       int l=0;
       int r=nums.length-1;
       while (l<=r){
           //中间的索引
           int m=l+(r-l)/2;
           if (nums[m]==target){
               return m;
           }else if (nums[m]<target){
               //在l的右边
               l=m+1;
           }else {
               //在r的左边
               r=m-1;
           }
       }
       return l;

    }
}
