import java.util.*;

class Solution {
    public long solution(long n) {
        String k = Long.toString(n);
        String[] num = k.split("");
        Arrays.sort(num, Collections.reverseOrder());
        
        StringBuilder temp = new StringBuilder();
        for(String f : num) {
            temp.append(f);
        }
        
        long numx = Long.parseLong(temp.toString());

       
        return numx;
    }
}
