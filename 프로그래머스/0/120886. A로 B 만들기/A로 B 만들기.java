import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Solution {
    public int solution(String before, String after) {
        int cnt =0;
        String a[] =before.split("");
        String b[] = after.split("");
        Arrays.sort(a);
        Arrays.sort(b);
        
        if(Arrays.equals(a, b)) {
        	return 1;
        }else {
        	return 0;
        }
 
    }
}