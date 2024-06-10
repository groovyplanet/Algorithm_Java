import java.util.*;

class Solution {
    public int solution(String number) {
        int k = 0;
 
        
        String [] n=number.split("");
        
        for(int i=0; i<n.length; i++) {
        	k+=Integer.parseInt(n[i]);
        }
        int answer=k%9;
        
        
        return answer;
    }
}