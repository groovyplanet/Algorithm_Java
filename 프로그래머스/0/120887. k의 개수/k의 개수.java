class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int x=i; x<=j; x++ ) {
        	String z []=String.valueOf(x).split("");
        	for(int y=0; y<z.length; y++) {
        		if(z[y].equals(String.valueOf(k))){
        			answer++;
        		}
        	}
        }     
        return answer;
    }
}