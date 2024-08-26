import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int [s.length()];
        Arrays.fill(answer, -1); //-1로 초기화 (Arrays.fill)
        
        Map<Character, Integer> map = new HashMap<>(); //Map으로 인덱스 저장
        
        for(int i=0 ; i<s.length(); i++) {
        	char ch = s.charAt(i);
        	if(map.containsKey(ch)) {
        		int pre = map.get(ch);
        		answer[i] = i-pre;
        	}
        	map.put(ch, i);
        }
        
        return answer;
    }
}