package Easy;
//https://leetcode.com/problems/two-sum/
public class P1 {
    public int[] twoSum(int[] nums, int target) {
        boolean found= false;
        int[] result= new int[2];
        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j<nums.length; j++ ){
                if (nums[i]+ nums[j]== target){
                    result[0]= i;
                    result[1]= j;
                    found= true;
                    break;
                }
            }
            if(found){
                break;
            }

        }
        return result;

    }
}
