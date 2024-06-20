class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int x=0;
        while(k>0){
        	answer=numbers[x%numbers.length];
        	x+=2;
        	k--;
        }
        return answer;
    }
}