class Solution {
    public int solution(int[] numbers) {
    	
    	boolean [] x = new boolean[10];
    	int sum =0;
    	
    	for(int y : numbers) {
    		x[y]=true;
    	}
    	
    	for(int i = 0 ; i<10 ; i++) {
    		if(!x[i]) {
    			sum+=i;
    		}
    	}
    	return sum;
    	
    }
}