class Solution {
    public String solution(String my_string, int[][] queries) {
    	StringBuilder sb = new StringBuilder(my_string);
        for(int i =0 ;i<queries.length; i++) {
        	int x = queries[i][0];
        	int y = queries[i][1];
        	
        	while(x<y) {
        		char temp=sb.charAt(x);
        		sb.setCharAt(x, sb.charAt(y));
        		sb.setCharAt(y, temp);
        		x++;
        		y--;
        	}
  
        }
 
        return sb.toString();
    }
}
