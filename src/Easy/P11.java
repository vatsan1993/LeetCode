package Easy;
//https://leetcode.com/problems/merge-sorted-array/
public class P11 {
//    1. create i j and k, i and j will start from 0 but k will be set to i in case we need to use it with the sort.
//    2. loop till we reach end of the first array or end of the second array.
        //2.1. get the value from first array and second array
        //2.2 if val1 is less than or equal to val2
                // a. increase i by 1.
        // 2.3 if not
                //a. make space in first array to place the value(using a loop)
                //b. place the value in the new spot
                // increase j, i, m
        //2.4 increase k
//    3. add all remaining values to the first array.


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = i;
        while(i < m && j < n) {
            int val1= nums1[i];
            int val2= nums2[j];
            if(val1 <= val2) {
                i++;
            }
            else {
                // making space for the value by moving values right
                int x = m;
                while(x > k) {
                    nums1[x] = nums1[x - 1];
                    x--;
                }
                nums1[k] = val2;
                j++;
                i++;
                m++; // as m represents number of values currently, we increase m when a new value is added to the array.
            }
            k++;
        }
        // adding any remaining values
        while(j < n) {
            int x = k;
            int val2 = nums2[j];
            nums1[k] = val2;
            j++;
            k++;
        }
    }
}
