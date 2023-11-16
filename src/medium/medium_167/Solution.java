package medium.medium_167;

public class Solution {
    /**
     * 886ms,改进
     *
     * @param numbers
     * @param target
     * @return
     */
//    public int[] twoSum(int[] numbers, int target) {
//        int length = numbers.length - 1;
//        int x = 0;
//        int y = 0;
//        while (x < length) {
//            if (y == 0) {
//                y = x + 1;
//            }
//            if (numbers[x] + numbers[y] == target) {
//                return new int[]{x+1,y+1};
//            }
//            y++;
//            if (y > length||numbers[x] + numbers[y]>target) {
//                x++;
//                y = 0;
//            }
//        }
//        return new int[]{-1,-1};
//    }
    public int[] twoSum(int[] numbers, int target) {
        int x = 0;
        int y=numbers.length-1;
        while (x < y) {
            if (numbers[x] + numbers[y]== target) {
                return new int[]{x + 1, y + 1};
            } else if (numbers[x] + numbers[y] < target) {
                x++;
            } else {
                y--;
            }
        }
        return new int[]{-1, -1};
    }
}
