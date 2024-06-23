import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String [] answer = new String[picture.length*k];
        
        int cnt = 0;
        for(String z : picture) {
        	StringBuilder sb = new StringBuilder();
        	for(char c : z.toCharArray()) {
        		sb.append(Character.toString(c).repeat(k));
        	}
        	String str = sb.toString();
        	for(int i=0; i<k ; i++) {
        		answer[cnt++]=str;
        	}
        }
        return answer;
 
    }
}
    