import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
       
        String k [] = s.split("");
        for(String z : k) {
        	char ch = z.charAt(0);
        	if(ch==' ') {
        		answer+= " ";
        	}else if(Character.isLowerCase(ch)) {
        		char x = (char)((ch-'a'+n) % 26 + 'a');
        		answer+=x;
        	}else if(Character.isUpperCase(ch)) {
        		char x = (char)((ch -'A'+n)%26 + 'A');
        		answer+=x;
        	}
        			
        	}
      
        
        return answer;
    }
}