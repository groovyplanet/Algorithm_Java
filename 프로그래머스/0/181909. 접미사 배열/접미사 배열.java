import java.util.*;

class Solution {
    public String[] solution(String my_string) {

        String[] x =new String[my_string.length()];
        
        for(int i=0; i<x.length; i++) {
        	x[i]=my_string.substring(i);
        }
        
        Arrays.sort(x);
   
        return x;
    }
}