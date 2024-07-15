class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int k : arr) {
        	answer+=k;
        }
        answer=answer/arr.length;
        
        return answer;
    }
}