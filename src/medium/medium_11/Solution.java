package medium.medium_11;

public class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int res=0;
        while(l<r){
            int sum=(r-l)*Math.min(height[l],height[r]);
            if (sum>res){
                res=sum;
            }
            if (height[l]<height[r]){
                l++;
            }else {
                r--;
            }
        }
        return res;
    }
}
