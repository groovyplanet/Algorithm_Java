import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        
        List <Integer> list = new ArrayList<Integer>();
        
        int cnt = 0;
        for(int i =0; i<intStrs.length; i++) {
  
        	int x = Integer.parseInt
        			(intStrs[i].substring(s,s+l));
        	if(x>k) {
        		list.add(x);
        	}
        }
        int[] answer =new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }

        return answer;
    }
}