import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        Set<String> set = new LinkedHashSet<>();
        
        String x []=my_string.split("");
        
        for(String k : x) {
        	set.add(k);
        }
        
        
        for(String f : set) {
        	answer+=f;
        }
   
        
        return answer;
    }
}
