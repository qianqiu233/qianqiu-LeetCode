package easy.easy_88;

import java.util.Arrays;

public class Solution {
    /**
     * 尾插，然后排序
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        for (int i=0;i<n;i++){
//            nums1[m+i]=nums2[i];
//        }
//        Arrays.sort(nums1);
//    }

    /**
     * 从最后一个开始比较，谁大，谁就占据
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
          int len=m+n-1;
          m--;
          n--;
          while (n>=0){
              while(m>=0&&nums1[m]>nums2[n]){
                  nums1[len--]=nums1[m--];
              }
              nums1[len--]=nums2[n--];
          }
    }
}
