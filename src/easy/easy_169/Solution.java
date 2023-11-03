package easy.easy_169;

import java.util.HashMap;
import java.util.Set;

public class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int length = nums.length;
        int max = length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            //没有东西，丢进去
            if (map.size() == 0) {
                map.put(nums[i], 1);
                //如果只有一个元素，那么就直接返回
                res=nums[i];
                continue;
            }
            int count=searchInMap(map, nums[i]);
            if (count>max){
                res=nums[i];
                break;
            }
        }
        return res;
    }

    /**
     * 存在就+1
     * 不在就放入
     * @param map
     * @param num
     * @return
     */
    private int searchInMap(HashMap<Integer, Integer> map, int num) {
        int n=0;
            Integer count = map.get(num);
            if (map.containsKey(num)) {
                map.put(num, ++count);
                n=count;
            } else {
                map.put(num, 1);
                n=1;
            }
        return n;
    }
}
