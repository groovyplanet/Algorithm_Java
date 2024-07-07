class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double x = stupid(dots[0],dots[1]);
        double y = stupid(dots[2],dots[3]);
        
        if(stupid(dots[0],dots[1])==stupid(dots[2],dots[3])) return 1;
        if(stupid(dots[0],dots[2])==stupid(dots[1],dots[3])) return 1;
        if(stupid(dots[0],dots[3])==stupid(dots[1],dots[2])) return 1;
        return 0;
    }
    
    private double stupid(int[] a, int[] b ) {
    	return (double)(b[1]-a[1]) / (b[0]-a[0]);
    }
    
}