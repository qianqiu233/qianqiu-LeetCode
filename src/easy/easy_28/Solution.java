package easy.easy_28;

public class Solution {
    /**
     * 1 版 我tm暴力
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        int index = -1;
        char[] s1 = haystack.toCharArray();
        char[] s2 = needle.toCharArray();
        if (s1.length<s2.length){
            return index;
        }
        boolean flag=false;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == s2[0]) {
                for (int j = 0; j < s2.length; j++) {
                    if (i+j>=s1.length){
                        flag=false;
                        break;
                    }
                    if (s1[i+j]==s2[j]){
                        flag=true;
                    }else {
                        flag=false;
                    }
                    if (!flag){
                        break;
                    }
                }
            }
            if (flag){
                index=i;
                break;
            }
        }
        return index;
    }
}
