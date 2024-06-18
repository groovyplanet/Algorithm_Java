import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String result = "";
        List <Integer> list = new ArrayList<Integer>();
        
        
        for(int i=0; i<array.length; i++) {
        	result+=String.valueOf(array[i]);
        }
        String [] k=result.split("");
        
        for(int i=0; i<k.length;i++) {
        	if(k[i].equals("7")) {
        		answer++;
        	}
        }

        return answer;
    }
}  