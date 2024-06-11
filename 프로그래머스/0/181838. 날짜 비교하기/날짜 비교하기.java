import java.util.*;

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        String datex = "";
        String datey ="";
        
       List <Integer> list = new ArrayList<>();
       List <Integer> list2 = new ArrayList<>();
       
       for (int i = 0; i<date1.length; i++) {
    	   list.add(date1[i]);
    	   list2.add(date2[i]);
       }
       
       for (int x : list) {
    	   datex+=String.valueOf(x);
    	   
       }
       for (int y : list2) {
    	   datey+=String.valueOf(y);
    	   
       }
       
       int x=Integer.parseInt(datex);
       int y=Integer.parseInt(datey);
       
       if(x>=y) {
    	   answer=0;
       }else{
    	answer=1;
       }
       
        
       
        
        
        return answer;
    }
}