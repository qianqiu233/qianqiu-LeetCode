package medium.medium_289;

/**
 * *     如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡；
 *  *     如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活；
 *  *     如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
 *  *     如果死细胞周围正好有三个活细胞，则该位置死细胞复活；
 */
public class Solution {
    /**
     * 好好好，我直接暴力
     * @param board
     */
    public void gameOfLife(int[][] board) {
        int row = board.length;
        int column = board[0].length;
        int[][] res=new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                //复活
                if (board[i][j]==0&&count(board,i,j)==3){
                    res[i][j]=1;
                }
                if (board[i][j]==1){
                    if (count(board,i,j)<2){
                        res[i][j]=0;
                    }
                    if (count(board,i,j)==2||count(board,i,j)==3){
                        res[i][j]=1;
                    }
                    if (count(board,i,j)>3){
                        res[i][j]=0;
                    }
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                board[i][j]=res[i][j];
            }
        }
    }
    private int count(int[][] board,int i,int j){
        int res=0;
        for (int k = i-1; k <=i+1 ; k++) {
            for (int l = j-1; l <=j+1 ; l++) {
                if (k==i&&l==j){
                    continue;
                }
                if (k==-1||l==-1|k> board.length-1||l>board[0].length-1){
                    continue;
                }
                if (board[k][l]>0){
                    res++;
                }
            }
        }
        return res;
    }
}
