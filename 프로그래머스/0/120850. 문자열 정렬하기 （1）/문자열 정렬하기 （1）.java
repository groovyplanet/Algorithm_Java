import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Solution {
    public int[] solution(String my_string) {
       
        List <Integer> x = new ArrayList<>();
        
        for(char ch : my_string.toCharArray()) { //toCharArray는 문자열을 char 배열로 변환한다
        	if(Character.isDigit(ch)) { // Character.isDigit는 char 타입에 문자열인지 숫자열인지 판별한다.
        		x.add(Character.getNumericValue(ch)); //Character.getNumericValue(char ch)메서드는 주어진 문자의 숫자값을 반환한다.
        		//주어진 문자가 숫자인 경우 숫자값을 반환하고 , 그렇지 않은 경우에는 -1을 반환한다.
        	}
        }
        
        Collections.sort(x);
        
        int[]answer = new int [x.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i]=x.get(i);
        }
 
        return answer;
    }
}
        