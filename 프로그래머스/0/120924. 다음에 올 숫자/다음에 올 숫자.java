class Solution {
    public int solution(int[] common) {
        int answer = common[0];
  
        	if( common[1]-common[0] == common[2]-common[1]) {
        		int x =common[1]-common[0];
        		return common[common.length-1]+x;
        
        	}else {
        		int y =common[1]/common[0];
        		return common[common.length-1]*y;
        }
    }
}