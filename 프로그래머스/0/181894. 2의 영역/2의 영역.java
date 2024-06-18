import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = 1000000;
        int max = 1;
        List <Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i<arr.length; i++) {
        	if(arr[i]==2) {
        		 min = Math.min(min, i);
                 max = Math.max(max, i);
        		
        		}
        		
        	}
    
        if(min<=max) {
        	return Arrays.copyOfRange(arr, min, max+1);
        	//Arrays.copyOfRange 메서드는 시작 인덱스부터 끝 직전까지 출력됨
        	//Arrays.copyOfRange = (원본배열에서 , 첫번째 인덱스 , 끝 인덱스) 뽑아서 재배열화. 
        }else {
        	return new int[]{-1};
        }
 
    }
}