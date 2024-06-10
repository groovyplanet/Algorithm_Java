import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Solution {
    public int solution(int order) {
        int answer = 0;
        String x = String.valueOf(order);
        String k[]=x.split("");
        
        List <Integer> list = new ArrayList<Integer>();
        for(String z : k) {
        	if(z.equals("3")||z.equals("6")||z.equals("9")) {
        		answer++;
        	}
        }
  
        return answer;
    }
}