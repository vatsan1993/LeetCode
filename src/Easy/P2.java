package Easy;
//https://leetcode.com/problems/roman-to-integer/
public class P2 {

    public static int romanToInt(String s) {
        int total= 0;
        for(int i= 0; i< s.length(); i++){
            String word;
            if(i+2< s.length()){
                word= s.substring(i, i+2);
            }
            else{
                word= s.substring(i, i+1);
            }

            switch(word){
                case "IV":
                    total+=4;
                    i++;
                    break;
                case "IX":
                    total+=9;
                    i++;
                    break;
                case "XL":
                    total+=40;
                    i++;
                    break;
                case "XC":
                    total+=90;
                    i++;
                    break;
                case "CD":
                    total+=400;
                    i++;
                    break;
                case "CM":
                    total+=900;
                    i++;
                    break;
                default:
                    word= s.substring(i, i+1);
                    break;
            }

            switch(word){
                case "I":
                    total+=1;
                    break;
                case "V":
                    total+=5;
                    break;
                case "X":
                    total+=10;
                    break;
                case "L":
                    total+=50;
                    break;
                case "C":
                    total+=100;
                    break;
                case "D":
                    total+=500;
                    break;
                case "M":
                    total+=1000;
                    break;
                default:
                    break;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
