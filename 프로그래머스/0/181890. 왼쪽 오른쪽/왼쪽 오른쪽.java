import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<String>();
        String[] answer = {};
        int cnt=0;
        
        for(int i =0; i<str_list.length; i++) {
        	if(str_list[i].equals("l")) {
        		for(int j=0; j<i; j++) {
        			list.add(str_list[j]);
        		}
        		break;
        	}
        	else if (str_list[i].equals("r")) {
                for(int j=i+1; j<str_list.length;j++){
                    list.add(str_list[j]);
                }
                break;
        }
        }
         if (list.isEmpty()) {
            return new String[0];
        }
        
        return list.toArray(new String[0]);
    }
}