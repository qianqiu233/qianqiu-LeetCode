package easy.easy_125;

public class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        int length = s.length();
        if (length<=1){
            return true;
        }
        StringBuilder s1=new StringBuilder(length);
        for (char c : s.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                s1.append(c);
            }
        }
        return s1.toString().equals(s1.reverse().toString());
    }
//    public boolean isPalindrome(String s) {
//        s= s.toLowerCase();
    //去字符回慢
//        s=s.replaceAll("[^a-zA-Z0-9]","");
//        int x=0;
//        int y=s.length()-1;
//        while (x<=y){
//            y=s.length()-1-x;
//            if (s.charAt(x)!=s.charAt(y)){
//                return false;
//            }
//            x++;
//        }
//        return true;
//    }
}
