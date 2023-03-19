package Easy;

import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class P6 {
    public static void main(String[] args) {
        int[] arr= {1,1,1,2,2,3,3,3,4};
//        int[] arr= {1,2,3,2,5,2,4,5};
        int result= removeDuplicates3(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }
    public static int removeDuplicates3(int[] nums){
        // only works for increasing values.
        // if the is empty or contains 1 value we return length

        if (nums.length == 0 || nums.length == 1)
            return nums.length;
        int j = 0; // keeps track where we need to insert
        for (int i = 0; i < nums.length-1; i++)
            // if the current value is not same as the next, we found a unique value
            if (nums[i] != nums[i+1])
                nums[j++] = nums[i]; // we insert it at the j and increase j
        nums[j++] = nums[nums.length-1]; // placing the last value.
        return j; // j will be the count;
    }
    public static int removeDuplicates2(int[] nums) {
        // Also satisfies the random duplication
        // create a hashset named uniques
        // create a variable j that tracks the place where we need to place the new unique value.
        // loop through the array.
            // if the current value is not in the uniques
                // add the number to the hashset
                // change the jth value with the current value
                // increase j
        // return number of values in the uniques.
        HashSet<Integer> uniques= new HashSet<>();
        for(int i= 0, j=0; i< nums.length; i++){
            if(! uniques.contains(nums[i])){
                uniques.add(nums[i]);
                nums[j]= nums[i];
                j++;
            }
        }
        return uniques.size();
    }

    public static int removeDuplicates(int[] nums) {
        // my code works for even if we dont have the values in increasing order.
        // Also not using hashset

        // 1. Create duplicate count;
        // 2. loop through nums till we reach the ending duplicate values. to avoid infinite loop
        // 3. if the number is a duplicate
            // a. move all values left
            // b. increase duplicate count
        // after moving if the current element is not duplicate again, then move to next element
        // return the total size of the array - duplicate count;

        int duplicateCount = 0;
        for(int i = 1; i < nums.length - duplicateCount;)
        {
            if(isDuplicate(nums, i)) {
                nums = moveElementsLeft(nums, i);
                duplicateCount++;
            }
            if(!isDuplicate(nums, i)){
                i++;

            }

        }
//        count = countUnique(nums);
        return nums.length- duplicateCount;
    }
//    public static int countUnique(int[] nums) {
//        int count = 1;
//        for(int i = 1; i < nums.length; i++) {
//            boolean isDuplicate = false;
//            for(int j = i - 1; j >=0; j--) {
//                if(nums[i] == nums[j]) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if(isDuplicate) {
//                break;
//            }
//            else {
//                count++;
//            }
//        }
//        return count;
//    }

    public static boolean isDuplicate(int[] nums, int i) {

        for(int j = i - 1; j >=0; j--) {
            if(nums[j] == nums[i]) {
                return true;
            }
        }
        return false;
    }
    public static int[] moveElementsLeft(int[] nums, int j) {
        for(int i = j + 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        return nums;
    }
}
