package Easy;
//https://leetcode.com/problems/plus-one/description/
public class P8 {
    public int[] plusOne(int[] digits) {
        // 1. add 1 to last digit.
        // loop through the digits from right to left.
        // if the current value is 10
        // make it 0 and add 1 to the left.
        // if not
        // break the loop
        // if the left most value is 0 then create a new array with one extra value.
        // put 1 there and return it.

        int lastIndex = digits.length-1;
        digits[lastIndex]++;
        for(int i= lastIndex; i>0; i--){
            if(digits[i]==10){
                digits[i]=0;
                digits[i-1]++;
            }
            else{
                break;
            }
        }
        if(digits[0]==10){
            int[] newArr=new int[digits.length+1];
            newArr[0] =1;
            return newArr;
        }
        return digits;

    }
}
