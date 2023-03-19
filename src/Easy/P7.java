package Easy;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class P7 {
    public static int strStr(String haystack, String needle) {

        int length= needle.length();
        if(haystack.equals(needle)){
            return 0;
        }
        if(haystack.length()< length){
            return -1;
        }
        for(int i=0; i<= haystack.length()- length-1;i++){

            if(haystack.substring(i,i+length).equals(needle)){
                return i;
            }
        }
        return -1;
    }


}
