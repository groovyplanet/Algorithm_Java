import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<lines.length; i++) {
        	int max = Math.max(lines[i][0], lines[i][1]);
        	int min = Math.min(lines[i][0], lines[i][1]);
        	
        	for(int j= min; j<max; j++) {
        		map.put(j, map.getOrDefault(j, 0)+1);
        	}
        }
        for(Integer k : map.values()) {
        	if(k>1) {
        		answer++;
        	}
        }
        return answer;
    }
}