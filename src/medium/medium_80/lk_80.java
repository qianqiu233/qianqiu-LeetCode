package medium.medium_80;

public class lk_80 {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3,4,4,4};
        int k = new Solution().removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }
}
