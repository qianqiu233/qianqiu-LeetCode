package test;
public class EditDistanceWithSteps {
    public static void main(String[] args) {
        String str1 = "FRAME";
        String str2 = "FAMILY";

        // 计算编辑距离,把矩阵结果返回
        int[][] dp = calculateEditDistanceWithSteps(str1, str2);
        //获取到最后一格，结果
        int editDistance = dp[str1.length()][str2.length()];
        System.out.println("最短编辑距离: " + editDistance);

        // 打印矩阵
        printEditDistanceMatrix(dp);
        // 输出每一步的操作
        printEditSteps(dp, str1, str2);
    }

    public static int[][] calculateEditDistanceWithSteps(String word1, String word2) {
        //初始化
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // 字符相同，保持字符
                } else {
                    int insert = dp[i][j - 1] + 1; // 插入操作
                    int delete = dp[i - 1][j] + 1; // 删除操作
                    int replace = dp[i - 1][j - 1] + 1; // 替换操作

                    dp[i][j] = Math.min(Math.min(insert, delete), replace);
                }
            }
        }

        return dp;
    }
    public static void printEditDistanceMatrix(int[][] dp) {
        System.out.println("编辑距离矩阵：");
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printEditSteps(int[][] dp, String word1, String word2) {
        System.out.println("操作步骤：");
        int i = dp.length - 1;
        int j = dp[0].length - 1;
        while (i > 0 && j > 0) {
            if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                System.out.println("步骤 " + dp[i][j] + ": 保持" + word1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i][j] == dp[i - 1][j - 1] + 1) {
                System.out.println("步骤 " + dp[i][j] + ": 将 " + word1.charAt(i - 1) + " 替换为 " + word2.charAt(j - 1));
                i--;
                j--;
            } else if (dp[i][j] == dp[i - 1][j] + 1) {
                System.out.println("步骤 " + dp[i][j] + ": 删除 " + word1.charAt(i - 1));
                i--;
            } else {
                System.out.println("步骤 " + dp[i][j] + ": 插入 " + word2.charAt(j - 1));
                j--;
            }
        }
        while (i > 0) {
            System.out.println("步骤 " + dp[i][0] + ": 删除 " + word1.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            System.out.println("步骤 " + dp[0][j] + ": 插入 " + word2.charAt(j - 1));
            j--;
        }
    }
}
