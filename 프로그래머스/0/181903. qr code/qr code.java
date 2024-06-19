import java.util.*;

class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String [] x = code.split("");
        for (int i=0; i<x.length; i++) {
        	if(i%q==r) {
        		answer+=x[i];
        	}
        }  
        return answer;
    }
}