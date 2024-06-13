import java.util.*;

class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for(int i=myString.length(); i>=pat.length(); i--) {
        	String a=myString.substring(0,i);
        	if(a.endsWith(pat)) {
        		answer=a;
        		break;
        	}
        }
        
        return answer;
    }
}