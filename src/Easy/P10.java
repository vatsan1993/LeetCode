package Easy;
//https://leetcode.com/problems/climbing-stairs/description/
public class P10 {
    // This uses fibonacci.
    //https://zyrastory.com/en/coding-en/leetcode-en/leetcode-70-climbing-stairs-solution-and-explanation-en/#leetcode-problem
    int climbStairs(int n) {
        if(n<=2) {
            return n ;
        }
        int first = 1;
        int second = 2;


        for(int i = 3; i <=n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }

        return second;

    }
}
