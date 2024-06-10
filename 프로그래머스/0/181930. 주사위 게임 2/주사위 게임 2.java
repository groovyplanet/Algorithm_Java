import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum=a+b+c;
        int triple = (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        int two = (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        
        if(a!=b && b!=c && a!=c) {
        	answer = sum;
        	
        }else if(a==b && b==c && a==c) {
        	answer = sum*two*triple;
        }else {
        	answer =  sum*two;
        }
        
        return answer;
    }
}
      