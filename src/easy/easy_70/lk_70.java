package easy.easy_70;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 思路
 * f(x)=f(x−1)+f(x−2)
 */
public class lk_70 {
    public static void main(String[] args) {
        int n=45;
        System.out.println(new Solution().climbStairs(n));
    }
}
