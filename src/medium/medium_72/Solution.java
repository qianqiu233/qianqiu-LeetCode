package medium.medium_72;

public class Solution {
    public int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        if (l1 * l2 == 0) {
            return l1 + l2;
        }
        int[][] D = new int[l1 + 1][l2 + 1];
        for (int i = 0; i < l1 + 1; i++) {
            D[i][0] = i;
        }
        for (int j = 0; j < l2 + 1; j++) {
            D[0][j] = j;
        }
        for (int i = 1; i < l1+1; i++) {
            for (int j = 1; j < l2+1; j++) {
                int a=D[i-1][j]+1;
                int b=D[i][j-1]+1;
                int c=D[i-1][j-1];
                if (word1.charAt(i-1)!=word2.charAt(j-1)){
                    c=c+1;
                }
                D[i][j]= Math.min(a,Math.min(b, c));
            }
        }
        return D[l1][l2];
    }
}
