package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        //定义返回的结果棋盘
        List<List<String>> result = new ArrayList<>();
        //定义棋盘
        char[][] chessboard = new char[n][n];

        // 初始化棋盘
        for (int i = 0; i < n; i++) {
            Arrays.fill(chessboard[i], '-');
        }
        // 调用求解方法
        solveNQueensHelper(result, chessboard, 0);
        return result;
    }

    /**
     * 按行处理，递归求解 5 皇后
     * @param result 棋盘结果集
     * @param chessboard 棋盘
     * @param row 当前放置皇后的行数
     */
    private void solveNQueensHelper(List<List<String>> result, char[][] chessboard, int row) {
        // 已经放置了5个皇后
        if (row == chessboard.length) {
            result.add(constructSolution(chessboard));
            return;
        }
        //遍历当前行的列，尝试放置皇后
        for (int column = 0; column < chessboard.length; column++) {
            if (isValid(chessboard, row, column)) {
                chessboard[row][column] = 'Q';  // 放置皇后
                solveNQueensHelper(result, chessboard, row + 1);  // 递归到下一行
                chessboard[row][column] = '-';  // 回溯，将皇后位置重置为 '-'
            }
        }
    }

    /**
     * 开始减枝
     * 一个校验，判断这一格是否能放皇后
     * @param chessboard 棋盘
     * @param row 行
     * @param column 列
     * @return
     */
    private boolean isValid(char[][] chessboard, int row, int column) {
        // 判断列相同的情况，是否存在皇后
        for (int i = 0; i < row; i++) {
            if (chessboard[i][column] == 'Q') {
                return false;
            }
        }

        //判断两个对角线是否有皇后
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = column + 1; i >= 0 && j < chessboard.length; i--, j++) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        //符合要求
        return true;
    }

    // 棋盘的格式
    private List<String> constructSolution(char[][] chessboard) {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < chessboard.length; i++) {
            solution.add(new String(chessboard[i]));
        }
        return solution;
    }

    public static void main(String[] args) {
        //创建对象
        NQueens nQueens = new NQueens();
        //调用方法，5 皇后 启动！！！！！
        List<List<String>> results = nQueens.solveNQueens(5);
        System.out.println("5皇后求解的结果个数为: "+results.size());
        //输出结果棋盘
        int i=0;
        for (List<String> result : results) {
            i++;
            System.out.println("第"+i+"个解");
            for (String row : result) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
