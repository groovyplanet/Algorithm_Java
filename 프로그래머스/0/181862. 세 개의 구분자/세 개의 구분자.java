import java.util.ArrayList;
import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] x = myStr.split("[abc]");
        List<String> list = new ArrayList<>();
        for (String k : x) {
            if (!k.isEmpty()) {
                list.add(k);
            }
        }  
        if (list.isEmpty()) {
        	list.add("EMPTY");
        }
        return list.toArray(new String[0]);
    }
}