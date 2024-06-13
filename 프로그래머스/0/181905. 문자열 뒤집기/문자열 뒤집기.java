import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        String [] str =my_string.split("");
        for(int i =s; i<=e; i++) {
        	sb.append(str[i]);
        }
        
        String k[] = sb.reverse().toString().split("");
        int cnt=0;
        for(int i=s; i<=e; i++) {
        	str[i]=k[cnt];
        	cnt++;
        }
        
        for(int i =0; i<str.length; i++) {
        	answer+=str[i];
        }
        
        
  
        return answer;
    }
}
