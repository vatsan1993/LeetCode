package Easy;
//https://leetcode.com/problems/roman-to-integer/
public class P2 {
    // my code
//    public static int romanToInt(String s) {
//        int total= 0;
//        for(int i= 0; i< s.length(); i++){
//            String word;
//            if(i+2<= s.length()){
//                word= s.substring(i, i+2);
//            }
//            else{
//                word= s.substring(i, i+1);
//            }
//
//            switch(word){
//                case "IV":
//                    total+=4;
//                    i++;
//                    break;
//                case "IX":
//                    total+=9;
//                    i++;
//                    break;
//                case "XL":
//                    total+=40;
//                    i++;
//                    break;
//                case "XC":
//                    total+=90;
//                    i++;
//                    break;
//                case "CD":
//                    total+=400;
//                    i++;
//                    break;
//                case "CM":
//                    total+=900;
//                    i++;
//                    break;
//                default:
//                    word= s.substring(i, i+1);
//                    break;
//            }
//
//            switch(word){
//                case "I":
//                    total+=1;
//                    break;
//                case "V":
//                    total+=5;
//                    break;
//                case "X":
//                    total+=10;
//                    break;
//                case "L":
//                    total+=50;
//                    break;
//                case "C":
//                    total+=100;
//                    break;
//                case "D":
//                    total+=500;
//                    break;
//                case "M":
//                    total+=1000;
//                    break;
//                default:
//                    break;
//            }
//        }
//        return total;
//    }

    // Alternate lowest

    public static int translate(char ch){

        switch(ch)
        {
            case 'I': return  1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static int romanToInt(String s)
    {
        int total=0;
        int cur= translate(s.charAt(0));
        for(int i= 1; i< s.length(); i++){
            int next= translate(s.charAt(i));
            if(cur< next){
                total-= cur;
            }else{
                total+= cur;
            }
            cur= next;
        }
        total+=cur;

        return  total;

    }


    // Another Possible solution
//    private final static Map<Character, Integer> VALUES = new HashMap<>();
//
//    static {
//        VALUES.put('M', 1000);
//        VALUES.put('D', 500);
//        VALUES.put('C', 100);
//        VALUES.put('L', 50);
//        VALUES.put('X', 10);
//        VALUES.put('V', 5);
//        VALUES.put('I', 1);
//    }
//
//    public int romanToInt(String s) {
//        int total = VALUES.get(s.charAt(s.length() - 1));
//        for (int i = s.length() - 2; i >= 0; i--) {
//            if (VALUES.get(s.charAt(i)) >= VALUES.get(s.charAt(i + 1))) {
//                total += VALUES.get(s.charAt(i));
//            } else {
//                total -= VALUES.get(s.charAt(i));
//            }
//        }
//        return total;
//    }
//

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
