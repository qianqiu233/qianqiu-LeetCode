package easy.easy_14;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1：
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 */
public class lk_14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String[] strs1 = {"a"};
        String s = new Solution().longestCommonPrefix(strs);
        System.out.println(s);
    }
}






















