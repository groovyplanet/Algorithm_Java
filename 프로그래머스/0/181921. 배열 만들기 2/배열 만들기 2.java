import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {-1};
        
        List <Integer> resultList = new ArrayList<Integer>();
        
        for(int i =l; i<= r; i++) {
        	String st = String.valueOf(i); //  i 값을 String화
        	boolean tf = true;
        	
        	for(char c : st.toCharArray()) { // i값을 char로 for문
        		if(c!='0' && c != '5') { //0이나 5로 이루어진 값이 아니라면 = 종료
        			tf = false; 
        			break;
        		}
        	}
        	
        	if(tf) {
        		resultList.add(i); // true면 list 배열에 추가
        	}
        	
        }
        if(resultList.isEmpty()) { // 없으면 -1
        	return answer;
        }else {
        	return resultList.stream().mapToInt(Integer::intValue).toArray();
        }

    }
}