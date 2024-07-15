public class Solution {
    public int solution(int n) {
        int answer = 0;

        String k = n+"";
        String krr[]=k.split("");
        
        for (String a : krr) {
        	int c = Integer.parseInt(a);
        	answer+=c;
        }

        return answer;
    }
}