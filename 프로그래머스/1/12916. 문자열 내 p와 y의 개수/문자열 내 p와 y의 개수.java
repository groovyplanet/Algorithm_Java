class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String k []=s.split("");
        int cntp = 0;
        int cnty = 0;
        for(String z : k) {
        	
        	
        if(	z.toLowerCase().contains("p")) {
        	cntp++;
        }else if(z.toLowerCase().contains("y")){
        	cnty++;
        }
        }
        if(cntp!=cnty) {
        	answer= false; 
        }
        		
    

        return answer;
    }
}