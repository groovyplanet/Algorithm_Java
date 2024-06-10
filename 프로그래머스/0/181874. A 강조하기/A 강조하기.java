import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Solution {
    public String solution(String myString) {
        String answer = "";
        List <String> list = new ArrayList<>();
        String k []=myString.split("");//스트링배열
        for(String x : k) {
        	if(x.equals("a") || x.equals("A")){
        		list.add(x.toUpperCase());
        	}else {
        		list.add(x.toLowerCase());
        	}
        	
        }
        for(String z : list) {
        	answer+=z;
        }
 
        
        return answer;
    }
}