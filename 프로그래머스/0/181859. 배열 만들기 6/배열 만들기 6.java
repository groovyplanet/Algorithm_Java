import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack <Integer> steak = new Stack<Integer>();
        int i=0;
        int empty [] = {-1};
        while(i<arr.length) {
        	if(steak.isEmpty()) {
        		steak.push(arr[i]);
        		i++;
        	}else if(steak.get(steak.peek())==arr[i]) {
        		steak.pop();
        		i++;
        	}else if(steak.get(steak.peek())!=arr[i]) {
        		steak.push(arr[i]);
        		i++;
        	}
        	
        }
        
        if(steak.isEmpty()) {
        	return empty;
        }
        
        
        
        return steak.stream().mapToInt(Integer::intValue).toArray();
    }
}
            
            
        
  

