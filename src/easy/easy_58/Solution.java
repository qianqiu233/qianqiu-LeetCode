package easy.easy_58;

public class Solution {
    /**
     * 1 版
     * @param s
     * @return
     */
//    public int lengthOfLastWord(String s) {
//        int end = s.length();
//        int begin=0;
//        for (int i=end-1;i>=0;i--){
//            if (s.charAt(end-1)==' '){
//                end=end-1;
//                continue;
//            }
//            if (' '==s.charAt(i)){
//                //需要的字符串在后面
//                begin=i+1;
//                break;
//            }
//        }
//        return end-begin;
//    }

    /**
     * 2版
     * @param s
     * @return
     */
//    public int lengthOfLastWord(String s) {
//        int length = s.length()-1;
//        int res=0;
//        while (s.charAt(length)==' '){
//            length--;
//        }
//        while (length>=0&&s.charAt(length)!=' '){
//            res++;
//            length--;
//        }
//        return res;
//    }

    /**
     * 3 版 我是傻逼
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        return s1[s1.length-1].length();
    }

}
