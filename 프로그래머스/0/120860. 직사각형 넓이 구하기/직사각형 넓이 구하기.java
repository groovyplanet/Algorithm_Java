class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int x = 0;
        int y = 0;
        
        for(int i=0; i<dots.length-1 ; i++) {
        	for(int j=i+1; j<dots.length; j++) {
        		if(dots[i][0]==dots[j][0]) {
        			y=Math.abs(dots[i][1]-dots[j][1]);
        		}else if(dots[i][1]==dots[j][1]) {
        			x=Math.abs(dots[i][0]-dots[j][0]);
        		}
        	}
        	
        	
        }
        
        
        return x*y;
    }
}