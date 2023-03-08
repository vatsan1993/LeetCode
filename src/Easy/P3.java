package Easy;
//https://leetcode.com/problems/longest-common-prefix/
public class P3 {
//    public static String longestCommonPrefix(String[] strs) {
//        // find the smallest length;
//        int minLength= strs[0].length();
//        for(int i= 1; i< strs.length; i++){
//            if(strs[i].length()< minLength){
//                minLength= strs[i].length();
//            }
//        }
//        // create a variable firstWord that stores the first string
//        // Create a variable called output that stores the final string.
//        // loop from 0 to smallestLength;
//            // loop through strings in the array starting from the second string
//                // if the current character is not same as the current character in the firstWord,
//                    //return the output
//
//            // if the character exists in both(We will know this if the loop runs completely ), add the character to the output
//        // at the end return the output;
//        String firstWord= strs[0];
//        String output= "";
//        for(int i= 0; i< minLength; i++){ // i is for current character
//            for(int j=1; j< strs.length; j++){ // j is for the current string from thr array.
//                if (firstWord.charAt(i) != strs[j].charAt(i)){
//                    return output;
//                }
//
//            }
//            output+=firstWord.charAt(i);
//        }
//        return output;
//    }

    // Alternate Approach
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length== 0){
            return "";
        }
        String prefix= strs[0];
        for (int i=1; i< strs.length; i++){
            // checking if the prefix is not available at the starting.
            while (strs[i].indexOf(prefix)!=0){
                // reducing one character from the prefix.
                prefix= prefix.substring(0, prefix.length()-1);
            }
        }
        return  prefix;
    }

    public static void main(String[] args) {
        String[] arr= {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }
}
