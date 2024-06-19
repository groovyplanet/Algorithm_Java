class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String k : order) {
        	if(k.contains("cafe")) {
        		answer+=5000;
        	}else {
        		answer+=4500;
        	}
        }

        return answer;
    }
}