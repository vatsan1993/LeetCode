package Easy;
//https://leetcode.com/problems/sqrtx/
public class P9 {
    public static int mySqrt(int x){
        if(x==0){
            return 0;
        }
        for(long i=1; i< x; i++){
            if(i*i== x){
                return (int)i;
            }
            if(i*i >x){
                return (int)i-1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}
