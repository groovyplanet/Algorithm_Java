import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[numlist.length];
        int cnt=0;
        for(int i = 0 ; i<numlist.length; i++) {
        	if(numlist[i]%n==0) {
        		answer[cnt]=numlist[i];
        		cnt++;
        	}
        }
        if(cnt<answer.length) {
        	answer = Arrays.copyOf(answer, cnt);
        }
        
        
        return answer;
    }
}