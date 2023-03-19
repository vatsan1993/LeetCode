package Easy;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class P6 {
    public static int removeDuplicates(int[] nums) {
        int count = 0; // count for unique values
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
        count = countUnique(nums);
        return count;
    }
    public static int countUnique(int[] nums) {
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            boolean isDuplicate = false;
            for(int j = i - 1; j >=0; j--) {
                if(nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate) {
                break;
            }
            else {
                count++;
            }
        }
        return count;
    }

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
