package easy.easy_14;

/**
 * 1 版
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        int min=strs[0].length();
        char prefix;
        String res="";
        boolean flag=false;
        if(length==0){
            return res;
        }
        for(int i=0;i<length;i++){
            if (strs[i].length() < min) {
                min= strs[i].length();
            }
        }

        for (int i=0;i<min;i++){
            prefix=strs[0].charAt(i);
            for (int j=0;j<length;j++){
                if(strs[j].charAt(i)==prefix){
                    flag=true;
                }else {
                    flag=false;
                }
                if (flag==false){
                    break;
                }
            }
            if (flag==false){
                break;
            }
            res=strs[0].substring(0,i+1);

        }
        return res;

    }
}
