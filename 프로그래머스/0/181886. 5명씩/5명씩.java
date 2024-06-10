import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Solution {
    public String[] solution(String[] names) {
       
        
        List <String> list = new ArrayList<String>();

        for(int i=0; i<names.length; i+=5) {
        	list.add(names[i]);
        }
  
        
        return list.toArray(new String[0]);
    }
}