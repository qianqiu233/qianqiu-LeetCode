package easy.easy_121;

public class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        int min=prices[0];
        for (int i = 0; i < prices.length; i++) {
            int count = prices[i] - min;
            if (count>0){
                if (count>res){
                    res=count;
                }
            }else {
                min=prices[i];
            }
        }
        return res;
    }
}
