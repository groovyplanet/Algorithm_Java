import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int x = 0;
        int cnt=0;
        
        List <Integer> list = new ArrayList<Integer>();
        list.add(n);
        
        while(n!=1) {
        	if(n%2==0) {
        		n=n/2;
            	list.add(n);
            
            	
            }else {
            	n=(3*n)+1;
            	list.add(n);
            }
        }
        
        
       
        

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}