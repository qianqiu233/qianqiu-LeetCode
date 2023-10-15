package easy.easy_70;

public class Solution {
    //超时了
//    public int climbStairs(int n) {
//       int count =1;
//       if(n==0||n==1){
//           return count;
//       }else {
//           return climbStairs(n-1)+climbStairs(n-2);
//       }
    //当前次数等于前两次的和

    public int climbStairs(int n) {
        //类似一个横着的L形滑块，配合类似2048的的游戏玩法
        //p 前一个的次数，pp前前一个的次数
        int p = 0, pp = 0, count = 1;
        for (int i = 1; i <= n; ++i) {
            p=pp;
            pp=count;
            count=p+pp;
        }
        return count;
    }
}
