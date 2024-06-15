class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
        	int cnt = 0;
        	int k =num_list[i];
        	while(k>1) {
        		if(k%2==0) {
        			k=k/2;
        		}
        		else {
        			k=(k-1)/2;
        		}
        		cnt++;
        	}
        	answer+=cnt;	
        }
        return answer;
    }
}