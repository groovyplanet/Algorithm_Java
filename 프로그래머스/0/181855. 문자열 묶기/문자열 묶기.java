import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int max = 0;
        int [] f = new int [31];
        
        
        for(int i=1; i<strArr.length; i++) {
        	int z =strArr[i].length();
        	f[z]++;
        }

        
        for(int i=0; i<f.length; i++) {
        if(max<f[i]) {
        	max=f[i];
        }
        }
 
        return max;
    }
}