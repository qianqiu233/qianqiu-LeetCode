package easy.easy_392;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (t.length()==0&&s.length()>0){
            return false;
        }
        if (s==null||t==null){
            return true;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int i=0;
        int j=0;
        while (i<=s1.length-1){
            if (t1[j]==s1[i]){
                i++;
                j++;
            }else {
                j++;
            }
            if (j>t1.length-1&&i<= s1.length-1){
                return false;
            }
        }
        return true;
    }
}
