import java.util.*;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int num = phone_number.length();
        
        String lastnum = phone_number.substring(num-4);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<num-4; i++) {
        	sb.append("*");
        }
 
        return sb.toString()+lastnum;
    }
}