import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        
        if(arr.length==1) {
        	return answer;
        }
        
      int min  = 100000000;
      
        for(int i=0; i<arr.length; i++) {
        	if(min>arr[i]) {
        		min=arr[i];
        	}
        }
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]!=min) {
        		list.add(arr[i]);
        	}
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}